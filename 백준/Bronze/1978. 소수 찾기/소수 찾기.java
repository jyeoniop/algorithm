import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> prim = new HashSet<>();

        for(int i=2;i<1001;i++){
            int j;
            for(j=2;j*j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j*j>i){
                prim.add(i);
            }
        }
        int count = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(prim.contains(num)){
                count++;
            }
        }
        
        System.out.println(count);

        
    }

    
    }
