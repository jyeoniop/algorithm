import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N =Integer.parseInt(br.readLine());
        int[] nums = new int[N+1];
        int[] dp = new int[N+1];
        int[] sum = new int[N+1];
        
        st = new StringTokenizer(br.readLine()," ");
        for(int i=1;i<=N;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        nums[0] = 0;
        dp[0] = 0;
        sum[0] = 0;
        for(int i=1;i<=N;i++){
            int maxindx = 0;
            int maxval = 0;
            for(int j=0;j<i;j++){
                if(maxval<sum[j]&&nums[i]>nums[j]){
                    maxval = sum[j];
                    maxindx = j;
                }
            }
            dp[i] = dp[maxindx]+1;
            sum[i] = sum[maxindx]+nums[i];


        }

        int result = 0;
        for (int i : sum) {
            result = Math.max(result, i);
        }

        System.out.println(result);
    
    }

}