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
        int[] cards = new int[N+1];

        st= new StringTokenizer(br.readLine(), " ");
        for(int i=1;i<=N;i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N+1];
        dp[0] = 0;
        for(int i=1;i<=N;i++){
            int max = 0;
            for(int j=1;j<=i;j++){
                max = Math.max(max, dp[i-j]+cards[j]);
            }
            dp[i]=max;
        }




        System.out.println(dp[N]);
    
    }

}