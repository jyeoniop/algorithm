import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int tarrow;
    static int tarcol;
    static int L;
    static boolean[][] visited;
    static int[][] count;
    public static void bfs(int r, int c) {
        int[] dx = {-2,-1,1,2,-2,-1,1,2};
        int[] dy = {1,2,2,1,-1,-2,-2,-1};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});
        visited[r][c] = true;

        
        while(!q.isEmpty()){
            int cur[] = q.poll();
            int currow = cur[0];
            int curcol = cur[1];
            // System.out.println("currow: curcol : "+currow+" - "+curcol);
            // System.out.println("count: "+count[currow][curcol]);

            if(currow==tarrow&&curcol==tarcol){
                return;
            }

            for(int i=0;i<8;i++){
                int nextrow = currow+dx[i];
                int nextcol = curcol+dy[i];

                if(nextrow>=0&&nextrow<L&&nextcol>=0&&nextcol<L){
                    if(!visited[nextrow][nextcol]){
                        visited[nextrow][nextcol] = true;
                        q.add(new int[]{nextrow, nextcol});
                        count[nextrow][nextcol] = count[currow][curcol]+1;
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
        

        int T = Integer.parseInt(br.readLine());
        for(int r=0;r<T;r++){

            L = Integer.parseInt(br.readLine());
            st= new StringTokenizer(br.readLine()," ");
            int currow =Integer.parseInt(st.nextToken());
            int curcol = Integer.parseInt(st.nextToken()); 
    
            st= new StringTokenizer(br.readLine()," ");
            tarrow =Integer.parseInt(st.nextToken());
            tarcol = Integer.parseInt(st.nextToken()); 
            visited = new boolean[L][L];
            count = new int[L][L];
    
            count[currow][curcol] =0;
            bfs(currow, curcol);
            
            sb.append(count[tarrow][tarcol]).append("\n");
        }

        System.out.println(sb.toString());
    
    }

}