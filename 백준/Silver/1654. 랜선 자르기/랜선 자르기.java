import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] lan = new int[K];

        for(int i=0;i<K;i++){
            lan[i] = Integer.parseInt(br.readLine());
        }

        long maxlen = 0;
        for(int len : lan){
            maxlen = Math.max(maxlen,len);
        }

        long count=0;
        long resultlen = 0;
        long low = 1;
        long high = maxlen;
        while(low<=high){
            long mid = low+(high-low)/2;
            count = 0;
            for(int len : lan){
                count += len/mid;
            }
            if(count>=N){
                resultlen = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }



        System.out.println(resultlen);
        
    }

    
    }

