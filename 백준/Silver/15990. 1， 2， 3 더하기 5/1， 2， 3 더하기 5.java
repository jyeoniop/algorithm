import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        long[][] dp = new long[100001][3];
        dp[1][0] = 1;
        dp[2][1] = 1;
        dp[3][0]=dp[3][1]=dp[3][2]=1;
        

        for(int i=4;i<=100000;i++){
            dp[i][0] = (dp[i-1][1]+dp[i-1][2])%1_000_000_009;
            dp[i][1] = (dp[i-2][0]+dp[i-2][2])%1_000_000_009;
            dp[i][2] = (dp[i-3][0]+dp[i-3][1])%1_000_000_009;
        }
        int T =Integer.parseInt(br.readLine());
        for(int k=0;k<T;k++){

            int N =Integer.parseInt(br.readLine());
    
    
    
            long result = 0;
            for (long i : dp[N]) {
                result += (i%1_000_000_009);
            }
            result %=1_000_000_009;
            sb.append(result).append("\n");
        } 

        System.out.println(sb.toString());
    
    }

}