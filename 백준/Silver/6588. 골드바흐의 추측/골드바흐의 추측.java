import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;




        boolean[] isnotprime = new boolean[1_000_001];
        isnotprime[0] = isnotprime[1] = true;
        for(int i=2;i<=Math.sqrt(1_000_000);i++){
            if(!isnotprime[i]){
                for(int j=i*i;j<=1_000_000;j+=i){
                    isnotprime[j] = true;
                }
            }
        }

        while (true) { 
            int N = Integer.parseInt(br.readLine());
            if(N==0){break;}
            
            boolean chk = true;
            for(int i=3;i<=N/2;i+=2){
                if(!isnotprime[i]&&!isnotprime[N-i]){
                    sb.append(N).append(" = ").append(i).append(" + ").append(N-i).append("\n");
                    chk = false;
                    break;
                }
            }
            if(chk){
                sb.append( "Goldbach's conjecture is wrong.\n");
            }
        }
        System.out.println(sb.toString());
    
    }
}