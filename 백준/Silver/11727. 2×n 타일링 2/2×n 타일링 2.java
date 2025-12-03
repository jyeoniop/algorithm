import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
 
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        long[] rectan = new long[N+1];
        if(N>0){
            rectan[1] = 1;
        }
        if(N>1){rectan[2] = 3;}
        if(N>2){
            for(int i=3;i<=N;i++){
                rectan[i] = (rectan[i-2]*2+rectan[i-1])%10007;
            }

        }




        
        System.out.println(rectan[N]);

        
    }

    
    }
