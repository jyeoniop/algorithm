
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    static int N;
    static int M;
    static int[] nums;
    static int size;
    static  boolean[] visited;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int start, int depth) {
        if(depth==M){
            for (int i : result) {
                sb.append(i).append(" ");
            }sb.append("\n");
            return;
        }

        for(int i=start;i<size;i++){
            result[depth] = nums[i];
            dfs(i, depth+1);
            // if(!visited[i]){
                // visited[i] = true;
                // visited[i] = false;
            // }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
       
       st = new StringTokenizer(br.readLine(), " ");
       Set<Integer> hset = new HashSet<>();
       for(int i=0;i<N;i++){
           int num =Integer.parseInt(st.nextToken());
           hset.add(num);
        }
        
        size = hset.size();
        nums = new int[size];
        int index = 0;
       for(int i:hset){
        nums[index] = i;
        index++;
          }
       
       Arrays.sort(nums);
       result = new int[M];
       visited = new boolean[size];
    
       dfs(0,0);

       System.out.println(sb.toString());
        

    }

}