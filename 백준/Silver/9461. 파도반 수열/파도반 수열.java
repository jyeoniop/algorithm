import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
 
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());

        long[] trian = new long[101];
        trian[1] = 1;
        trian[2] = 1;
        trian[3] = 1;

        for(int i=4;i<101;i++){
            trian[i] = trian[i-3]+trian[i-2];
        }

        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(trian[N]).append("\n");    
        }

        
        System.out.println(sb.toString());

        
    }

    
    }
