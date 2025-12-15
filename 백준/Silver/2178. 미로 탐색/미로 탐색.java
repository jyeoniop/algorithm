import java.io.*;
import java.util.*;

public class Main{
    static int[][] distance;
    static int[][] maze;
    static int M;
    static int N;

    public static  void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        int indx[] = {0,1,0,-1};
        int indy[] = {1,0,-1,0};

        q.add(new int[] {x,y});
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];

            if(curx ==N-1&&cury==M-1){
                return;
            }

            for(int i=0;i<4;i++){
                int nextx = curx+indx[i];
                int nexty = cury+indy[i];

                if(0<=nextx&&nextx<N&&0<=nexty&&nexty<M){
                    if(distance[nextx][nexty]==0&&maze[nextx][nexty]==1){
                        q.add(new int[] {nextx,nexty});
                        distance[nextx][nexty] = distance[curx][cury]+1;
                    }
                }
            }
            
        }
    }
    
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        distance = new int[N][M];
        maze = new int[N][M];
        
        for(int i=0;i<N;i++){
            String str= br.readLine();
            for(int j=0;j<M;j++){
                maze[i][j] = str.charAt(j)-'0';
            }
        }

        distance[0][0] = 1;

        
        bfs(0,0);
        
        System.out.println(distance[N-1][M-1]);
        
        
    }

    
    }
