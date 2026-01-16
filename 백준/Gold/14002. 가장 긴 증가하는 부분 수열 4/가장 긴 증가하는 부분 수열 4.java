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

        st =new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N];

        for(int i=0;i<N;i++){
            dp[i] = 1;
            int max = 0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        
        int maxval = 0;
        int maxind = 0;
        for(int i=0;i<N;i++){
            if(maxval<dp[i]){
                maxval = dp[i];
                maxind = i;
            }
        }
        

        int[] result = new int[maxval+1];
        int recnt = maxval;
        for(int i=maxind;i>=0;i--){
            if(recnt==dp[i]){
                result[recnt] = nums[i];
                recnt--;
            }
        }

        
        sb.append(maxval).append("\n") ;
        for(int i=1;i<=maxval;i++){
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb.toString());
    
    }

}