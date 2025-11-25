import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int N = Integer.parseInt(br.readLine());
        
        int[] score = new int[N+1];
        int[] step = new int[N+1];

        for(int i=1;i<=N;i++){
            score[i] = Integer.parseInt(br.readLine());
        }

        step[1] = score[1];
        if(N>1){step[2] = score[1]+ score[2];}
        if(N>2){step[3] = Math.max(score[1]+score[3], score[2]+score[3]);}
        
        for(int i=4;i<=N;i++){
            step[i] = Math.max(score[i]+score[i-1]+step[i-3], score[i]+step[i-2]);
        }



        System.out.println(step[N]);

        
    }

    
    }



        
     

