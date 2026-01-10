import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int N;
    static  boolean[] visited;
    static int[] result;
    static StringBuilder sb= new StringBuilder();
    public static  void dfs(int depth){
        if(depth == N){
            for (int i : result) {
                sb.append(i).append(" ");
            }sb.append("\n");
            return;
        }
        
        for(int i=1;i<=N;i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }

    }

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        

        N = Integer.parseInt(br.readLine());


        
        result = new int[N];
        visited = new boolean[N+1];
        dfs(0);


        System.out.println(sb.toString());
    
    }
}