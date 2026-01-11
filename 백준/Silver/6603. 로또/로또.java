import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int N;
    static  boolean[] visited;
    static int[] nums;
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    public static  void dfs(int start, int depth){
        if(depth == 6){
            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i=start;i<N;i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = nums[i];
                dfs(i+1, depth+1);
                visited[i] = false;

                
            }
        }
    }
    

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        while (true) { 
            st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());
            if(N==0){
                break;
            }

            nums= new int[N];
            for(int i=0;i<N;i++){
                nums[i] = Integer.parseInt(st.nextToken());
            }

            visited = new boolean[N+1];
            result = new int[6];

            dfs(0,0);
            sb.append("\n");
        }
       

        System.out.println(sb.toString());
    
    }
}