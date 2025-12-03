import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
 
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] numlist = new int[N+1];
        int[] numsum = new int[N+1];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=1;i<=N;i++){
            int num = Integer.parseInt(st.nextToken());
            numlist[i] = num;
            if(i==1){
                numsum[i] = numlist[i];
            }
            else{
                numsum[i] = numsum[i-1]+numlist[i];
            }
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int result = numsum[end]-numsum[start-1];
            sb.append(result).append("\n");
        }

        
        System.out.println(sb.toString());

        
    }

    
    }
