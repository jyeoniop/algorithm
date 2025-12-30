import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    static boolean[][] visited;
    static int N;
    static int[][] paintweek;
    static int[][] paintcolor;
    static int[][] count;
    static int countnum;
    public static void bfs(int[][] paint, int x, int y){
        int[] dx = {1,-1, 0,0};
        int[] dy = {0,0,1,-1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visited[x][y] = true;
        countnum++;
        count[x][y] = countnum;
        int paintchk=paint[x][y];
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
      
            for(int i=0;i<4;i++){
                int nextx = curx+dx[i];
                int nexty = cury+dy[i];
    
                if(nextx>=0&&nextx<N&&nexty>=0&&nexty<N){
                    if(!visited[nextx][nexty]&&paint[nextx][nexty]==paintchk){
                        visited[nextx][nexty] = true;
                        count[nextx][nexty] = countnum;
                        q.add(new int[]{nextx, nexty});
                    }
                }
            }
        }
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N  = Integer.parseInt(br.readLine());
        paintweek = new int[N][N];
        paintcolor = new int[N][N];
        
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                char ch = str.charAt(j);
                if(ch=='R'||ch=='G'){
                    paintweek[i][j] = 1;
                }else{
                    paintweek[i][j] = 0;
                }
                if(ch=='R'){
                    paintcolor[i][j] = 0;
                }else if(ch=='G'){
                    paintcolor[i][j] = 1;
                }else{
                    paintcolor[i][j] = 2;
                }
            }
        }
        
       
                
                
        visited = new boolean[N][N];
        count = new int[N][N];
        countnum = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]){
                    bfs(paintweek, i,j);
                }
            }
        }
        int weekmax =0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                weekmax = Math.max(weekmax, count[i][j]);
            }
        }
        
        visited = new boolean[N][N];
        count = new int[N][N];
        countnum = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]){
                    bfs(paintcolor, i,j);
                }
            }
        }
        int colormax =0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                colormax = Math.max(colormax, count[i][j]);
            }
        }
        
   




        
        System.out.println(colormax+" "+weekmax);
    }

    
    }
