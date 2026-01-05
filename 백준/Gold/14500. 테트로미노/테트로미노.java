import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int N;
    static int M;
    static int[][] tets;
    static boolean[][] visited;
    static int sum;
    static int max = 0;
    public static void dfs(int r, int c, int depth, int sum){

        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        if(depth==4){
            max = Math.max(max, sum);
            return;
        }
        for(int i=0;i<4;i++){
            int nr = r + dx[i];
            int nc = c + dy[i];

            if (nr >= 0 && nr < N && nc >= 0 && nc < M){{
                if(!visited[nr][nc]){
                    visited[nr][nc] = true;
                    dfs(nr,nc,depth+1, sum+tets[nr][nc]);
                    visited[nr][nc] = false;
                }
            }
            }
        }
        
    }
    public static void checkT(int r, int c) {
    // 1. 'ㅜ' 모양 (중심에서 하, 좌, 우)
    if (r + 1 < N && c - 1 >= 0 && c + 1 < M) {
        max = Math.max(max, tets[r][c] + tets[r+1][c] + tets[r][c-1] + tets[r][c+1]);
    }
    // 2. 'ㅗ' 모양 (중심에서 상, 좌, 우)
    if (r - 1 >= 0 && c - 1 >= 0 && c + 1 < M) {
        max = Math.max(max, tets[r][c] + tets[r-1][c] + tets[r][c-1] + tets[r][c+1]);
    }
    // 3. 'ㅏ' 모양 (중심에서 상, 하, 우)
    if (r - 1 >= 0 && r + 1 < N && c + 1 < M) {
        max = Math.max(max, tets[r][c] + tets[r-1][c] + tets[r+1][c] + tets[r][c+1]);
    }
    // 4. 'ㅓ' 모양 (중심에서 상, 하, 좌)
    if (r - 1 >= 0 && r + 1 < N && c - 1 >= 0) {
        max = Math.max(max, tets[r][c] + tets[r-1][c] + tets[r+1][c] + tets[r][c-1]);
    }
}
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        tets = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<M;j++){
                tets[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited = new boolean[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                visited[i][j] = true;
                dfs(i,j,1,tets[i][j]);
                visited[i][j] = false;

                checkT(i, j);
            }
        }
        
        

        System.out.println(max);
    
    }
}