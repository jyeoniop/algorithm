import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    static int[][] tomato;
    static boolean[][] visited;
    static int[][] count;
    static int N;
    static int M;

    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        for(int j=0;j<N;j++){
            for(int i=0;i<M;i++){
                if(tomato[i][j]==1){
                    q.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
            
            for(int i=0;i<4;i++){
                int nextx = curx+dx[i];
                int nexty = cury+dy[i];
                if(0<=nextx&&nextx<M&&0<=nexty&&nexty<N&&!visited[nextx][nexty]&&tomato[nextx][nexty]!=-1){
                    q.add(new int[]{nextx,nexty});
                    visited[nextx][nexty] = true;
                    count[nextx][nexty] = count[curx][cury]+1;
                }
            }

        }

    }

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        tomato = new int[M][N];
        count = new int[M][N];
        visited = new boolean[M][N];

        for(int j=0;j<N;j++){
            st= new StringTokenizer(br.readLine(), " ");
            for(int i=0;i<M;i++){
                int num = Integer.parseInt(st.nextToken());
                tomato[i][j] = num;
                if(num==1){
                    count[i][j] = 0;
                }else if(num==-1){
                    visited[i][j] = true;
                }
            }
        }


        bfs();
        
        boolean visitedchk = true;
        int max = 0;
        for(int j=0;j<N;j++){
            for(int i=0;i<M;i++){
                max = Math.max(max, count[i][j]);
                if(!visited[i][j]){
                    visitedchk = false;
                }
            }
        }
        if(!visitedchk){
            System.out.println("-1");
        }else{
            System.out.println(max);
        }



        
        
    }

    
    }
