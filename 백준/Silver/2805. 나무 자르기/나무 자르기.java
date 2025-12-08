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
        int[] tree = new int[N];
        st = new StringTokenizer(br.readLine()," ");

        int maxlen = 0;
        for(int i=0;i<N;i++){
            tree[i] = Integer.parseInt(st.nextToken());
            maxlen = Math.max(maxlen, tree[i]);
        }

        long high = maxlen;
        long low = 0;
        long resultlen = 0;
        while(low<=high){
            long mid = low + (high-low)/2;
            long sumlen = 0;
            for(int treelen : tree){
                if(treelen>mid){
                    sumlen += treelen -mid;
                }
            }
            if(sumlen>=M){
                resultlen = Math.max(resultlen, mid);
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        System.out.println(resultlen);
        
    }

    
    }
