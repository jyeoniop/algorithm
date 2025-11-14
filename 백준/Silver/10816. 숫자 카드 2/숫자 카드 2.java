import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        HashMap<Long,Integer> cards = new HashMap<>();
        
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0;i<N;i++){
            long num = Long.parseLong(st.nextToken());
            int count = 1;
            if(cards.containsKey(num)){count = cards.get(num)+1;}
            cards.put(num,count);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0;i<M;i++){
            long finenum = Long.parseLong(st.nextToken());
            if(cards.containsKey(finenum)){
                sb.append(cards.get(finenum)).append(" ");
            }
            else{
                sb.append("0 ");
            }
        }

        System.out.print(sb.toString());
        
        
        
        
        
        
    }

    }




