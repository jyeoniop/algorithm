import java.io.*;
import java.util.*;

public class Main{
    static boolean[][] visited;
    static int[][] house;
    static int[] houseCount;
    static int N;
    static int count;

    public static  void bfs(){
        Queue<int[]> q = new LinkedList<>();
        int indx[] = {0,1,0,-1};
        int indy[] = {1,0,-1,0};

        count = 0;
        houseCount = new int[N*N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if((house[i][j]==1)&&!visited[i][j]){

                    q.add(new int[] {i,j});
                    visited[i][j] = true;
                    
                    while(!q.isEmpty()){
                        houseCount[count]++;
                        int[] cur = q.poll();
                        int curx = cur[0];
                        int cury = cur[1];
                        
                        for(int k=0;k<4;k++){
                            int nextx = curx+indx[k];
                            int nexty = cury+indy[k];
            
                            if(0<=nextx&&nextx<N&&0<=nexty&&nexty<N){
                                if(!visited[nextx][nexty]&&house[nextx][nexty]==1){
                                q.add(new int[] {nextx,nexty});
                                visited[nextx][nexty]= true;
                                }
                            }
                        }
                        
                    }
                    count++;
                }
                
            }
        }
    }
    
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        N = Integer.parseInt(br.readLine());
        
        visited = new boolean[N][N];
        house = new int[N][N];
        
        for(int i=0;i<N;i++){
            String str= br.readLine();
            for(int j=0;j<N;j++){
                house[i][j] = str.charAt(j)-'0';
            }
        }
     
        bfs();

        Arrays.sort(houseCount);

        sb.append(count).append("\n");

        for(int i=0;i<houseCount.length;i++){
            if(houseCount[i] !=0){

                sb.append(houseCount[i]).append("\n");
            }
        }
    
        


        System.out.println(sb.toString());
        
        
    }

    
    }
