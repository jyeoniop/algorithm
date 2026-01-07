import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] result;
    static boolean[] visited;
    
    public static void dfs(int depth, int start){

        if(depth==M){
            for (int i : result) {
                sb.append(i).append(" ");
            }sb.append("\n");
            return;
        }
        for(int i=start;i<=N;i++){
            if(!visited[i]){
                result[depth] = i;
                dfs(depth+1, i);
                
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
        visited = new boolean[N+1];
     
        dfs(0,1);
        


        System.out.println(sb.toString());
    
    }
}