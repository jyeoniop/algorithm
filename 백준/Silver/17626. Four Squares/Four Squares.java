import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
 
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[] multinum = new int[N+1];
        multinum[0] = 0;
        multinum[1] = 1;

        if(N>1){
            for(int i=2;i<=N;i++){
                multinum[i] = multinum[i-1]+1;
                for(int j=2;j*j<=i;j++){
                    int square = j*j;
                    multinum[i] = Math.min(multinum[i], multinum[i-square]+1);
                }   
            }
        }
        


        System.out.println(multinum[N]);

        
    }

    
    }
