import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] Coin = new int[N];

        for(int i=0;i<N;i++){
            Coin[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for(int i=Coin.length-1;i>=0;i--){
            if(K==0){break;}
            if(Coin[i]<=K){
                count += K/Coin[i];
                K = K%Coin[i];
            }
        }
        

        System.out.println(count);

        
    }

    
    }



        
     
