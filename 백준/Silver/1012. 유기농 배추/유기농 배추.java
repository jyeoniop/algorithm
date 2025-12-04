import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    static boolean[][] farm;
    static int M, N;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void dfs(int r, int c){
        farm[r][c] = false;
        for(int i=0;i<4;i++){
            int nextR = r+dr[i] ;
            int nextC = c+dc[i];

            if(nextR>=0 && nextR<N && nextC >=0 &&nextC <M){
                if(farm[nextR][nextC]){
                    dfs(nextR, nextC);
                }
            }
        }
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        
        for(int t=0;t<T;t++){
            st = new StringTokenizer(br.readLine()," ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            farm = new boolean[N][M];
    
            for(int i=0;i<K;i++){
                st = new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                farm[y][x] = true;
            }
    
            int count = 0;
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(farm[i][j]){
                        count++;
                        dfs(i,j);
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb.toString());
        
    }

    
    }
