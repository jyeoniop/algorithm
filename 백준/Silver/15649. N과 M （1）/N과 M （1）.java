import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{

    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] result;
    static boolean[] visitied;
    public static void dfs(int depth){

        if(depth==M){

            for (int i : result) {
                sb.append(i).append(" ");
                
            }sb.append("\n");
            return;
        }
        for(int i=1;i<=N;i++){
            if(!visitied[i]){
                visitied[i] = true;
                result[depth] =i;
                dfs(depth+1);
                visitied[i] = false;

            }
        }
    }
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        result = new int[M];
        visitied = new boolean[N+1];
            dfs(0);




        System.out.println(sb.toString());
    
    }
}