import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
 
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        int[] plus = new int[12];
        plus[1] = 1;
        plus[2] =2;
        plus[3] = 4;

        for(int i=4;i<12;i++){
            plus[i] = plus[i-1]+plus[i-2]+plus[i-3];
        }

        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(plus[N]).append("\n");

        }
        
        System.out.println(sb.toString());

        
    }

    
    }
