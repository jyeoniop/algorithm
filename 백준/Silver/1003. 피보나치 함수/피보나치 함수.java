import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int K = Integer.parseInt(br.readLine());
        int[][] fibo = new int[41][2];
        fibo[0][0] = 1;
        fibo[0][1] = 0;
        fibo[1][0] = 0;
        fibo[1][1] = 1;

        for(int i =2;i<41;i++){
            fibo[i][0] = fibo[i-1][0] + fibo[i-2][0];
            fibo[i][1] = fibo[i-1][1] + fibo[i-2][1];
        }

        for(int i=0;i<K;i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(fibo[N][0]).append(" ").append(fibo[N][1]).append("\n");
        }



        System.out.println(sb.toString());

        
    }

    
    }



        
     
