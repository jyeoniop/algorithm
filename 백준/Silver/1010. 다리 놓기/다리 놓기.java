import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            
            int result = 1;
            for(int j=1;j<=N;j++){
                result = result*(M-N+j)/j;
            }
            sb.append(result).append("\n");
        }
        
        System.out.println(sb.toString());

        
    }

    
    }
