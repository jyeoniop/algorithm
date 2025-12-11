import java.io.*;
import java.util.*;

public class Main{
    static boolean[][] visited;
    static Character[][] campus;
    static int[]dx = {1,0,-1,0};
    static int[]dy = {0,1,0,-1};
    static int N, M;
    static int count=0;
    public static void sayhi(int x,int y){
        visited[x][y] = true;
        for(int i=0;i<4;i++){
            int cx=x+dx[i];
            int cy=y+dy[i];
            if(0<=cx&&cx<N&&0<=cy&&cy<M&&!visited[cx][cy]){
                if(campus[cx][cy]=='P'){
                    count++;
                    sayhi(cx,cy);
                }
                else if(campus[cx][cy]=='O'){
                    sayhi(cx,cy);
    
                }
            }
        }
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1][M+1];

        int Idx = 0, Idy=0;

        campus = new Character[N][M];

        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                char ch =  str.charAt(j);
                campus[i][j] = ch;
                if(ch=='I'){
                    Idx = i;
                    Idy = j;
                }
            }
        }
        sayhi(Idx,Idy);

        if(count==0){
            sb.append("TT");
        }else{
            sb.append(count);
        }
        
        System.out.println(sb.toString());
        
    }

    
    }
