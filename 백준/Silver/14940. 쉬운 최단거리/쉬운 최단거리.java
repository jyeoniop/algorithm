import java.io.*;
import java.util.*;

public class Main{
    static int[][] distance;
    static int[][] map;
    static boolean[][] visited;
    static int M;
    static int N;

    public static  void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        int indx[] = {0,1,0,-1};
        int indy[] = {1,0,-1,0};

        q.add(new int[] {x,y});
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];

            
            for(int i=0;i<4;i++){
                int nextx = curx+indx[i];
                int nexty = cury+indy[i];

                if(0<=nextx&&nextx<N&&0<=nexty&&nexty<M){
                         if(!visited[nextx][nexty]&&map[nextx][nexty]==1){
                        q.add(new int[] {nextx,nexty});
                        distance[nextx][nexty] = distance[curx][cury]+1;
                        visited[nextx][nexty] = true;
                    }
                }
            }
            
        }
    }
    public static void cantreach(){

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(!visited[i][j]&&map[i][j]!=0){
                    distance[i][j] = -1;
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
        map = new int[N][M];
        
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

   

        int curi=-1, curj=-1;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int num = map[i][j] ;
                if(num==2){
                    curi = i; 
                    curj = j;
                    break;
                }
            }
            if(curi!=-1){break;}
        }

        visited = new boolean[N][M];
        distance[curi][curj] = 0;
        bfs(curi,curj);
        cantreach();


        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sb.append(distance[i][j]);
                if(j!=M-1){
                    sb.append(" ");

                }
            }
            if(i!=N-1){
                sb.append("\n");
            }

        }

        System.out.println(sb.toString());
        
        
    
        
        
    }

    
    }
