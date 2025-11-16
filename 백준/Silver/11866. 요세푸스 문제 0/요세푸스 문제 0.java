import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st  = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> persons = new LinkedList<>();
        for(int i = 1;i<N+1;i++){
            persons.offer(i);
        }

        int i = 0;
        while(true){
            if(persons.size()==1){break;}
            i++;
            int turn = persons.poll();
            if(i!=K){
                persons.offer(turn);
            }
            else{
                sb.append(turn+", ");
                i = 0;
            }
        }
        sb.append(persons.poll());

        System.out.print("<"+sb.toString()+">");
        
        
    }

    }




