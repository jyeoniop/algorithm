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
        int[] nums = new int[N];

        st= new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<N;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        dp[0] = nums[0];

        int start = 0;
        for(int end=1;end<N;end++){
            int sum = 0;
            for(int i=start;i<=end;i++){
                sum += nums[i];
            }
            if(sum>nums[end]){
                dp[end] = sum;
            }else{
                dp[end] = nums[end];
                start = end;
            }
        }

        int max = dp[0];
        for (int i : dp) {
            max = Math.max(max, i);
        }


        System.out.println(max);
    
    }

}