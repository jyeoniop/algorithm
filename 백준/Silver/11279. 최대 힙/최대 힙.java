import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
 
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(maxheap.isEmpty()){
                    sb.append(0).append("\n");
                }
                else{
                    sb.append(maxheap.poll()).append("\n");
                }
            }
            else{
                maxheap.add(num);
            }
        }
        System.out.println(sb.toString());
        
    }

    
    }
