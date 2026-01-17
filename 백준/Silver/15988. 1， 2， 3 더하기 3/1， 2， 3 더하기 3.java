import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        

        for(int i=4;i<=1000000;i++){
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1_000_000_009;
        }
        int T =Integer.parseInt(br.readLine());
        for(int k=0;k<T;k++){

            int N =Integer.parseInt(br.readLine());
    
            long result = dp[N] %=1_000_000_009;
            
            sb.append(result).append("\n");
        } 

        System.out.println(sb.toString());
    
    }

}