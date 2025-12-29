import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    static int[][][] tomato;
    static int M, N, H;
    static boolean[][][] visited;
    static int[][][] count;
    public static void bfs(){

        Queue<int[]> q = new LinkedList<>();

        
        for(int i=0;i<H;i++){
            for(int j = 0;j<N;j++){
                for(int k=0;k<M;k++){
                    int num = tomato[k][j][i];
                    if(num==1){
                        q.add(new int[]{k,j,i});
                        visited[k][j][i] = true;
                    }
                }
            }
        }
        int[] dx = {1,-1,0,0,0,0};
        int[] dy = {0,0,1,-1,0,0};
        int[] dz = {0,0,0,0,1,-1};

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
            int curz = cur[2];

            for(int t=0;t<6;t++){
                int nextx = curx + dx[t];
                int nexty = cury + dy[t];
                int nextz = curz + dz[t]; 

                if(0<=nextx&&nextx<M&&0<=nexty&&nexty<N&&0<=nextz&&nextz<H){
                    if(!visited[nextx][nexty][nextz]){
                        visited[nextx][nexty][nextz] = true;
                        count[nextx][nexty][nextz] = count[curx][cury][curz]+1;
                        q.add(new int[]{nextx,nexty,nextz});

                    }
                }

            }

        }
        
    }

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ") ;

        M  = Integer.parseInt(st.nextToken());
        N  = Integer.parseInt(st.nextToken());
        H  = Integer.parseInt(st.nextToken());

        tomato = new int[M][N][H];
        visited = new boolean[M][N][H];
        count = new int[M][N][H];

        for(int i=0;i<H;i++){
            for(int j = 0;j<N;j++){
                st = new StringTokenizer(br.readLine()," ");
                for(int k=0;k<M;k++){
                    int num = Integer.parseInt(st.nextToken());
                    tomato[k][j][i] = num;
                    if(num==-1){
                        visited[k][j][i] = true;
                    }
                }
            }
        }
        bfs();


        int maxcount=0;
        int result=0;
        boolean visitchk = true;
        for(int i=0;i<H;i++){
            for(int j = 0;j<N;j++){
                for(int k=0;k<M;k++){
                    if(!visited[k][j][i]){
                        visitchk = false;
                        break;
                    }else{
                        maxcount = Math.max(maxcount, count[k][j][i]);
                    }
                }
                if(!visitchk){break;}
            }
            if(!visitchk){break;}
        }
        
        if(!visitchk){
            result = -1;
        }else{
            result = maxcount;
        }



        
        System.out.println(result);
    }

    
    }
