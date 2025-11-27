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
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String>pocketmonInt = new HashMap<>();
        HashMap<String,Integer>pocketmonStr = new HashMap<>();

        for(int i=1;i<N+1;i++){
            String name = br.readLine();
            pocketmonInt.put(i, name);
            pocketmonStr.put(name,i);
        }

        for(int i=0;i<M;i++){
            String input = br.readLine();
            char fisrt = input.charAt(0);
            if(Character.isDigit(fisrt)){
                int key = Integer.parseInt(input);
                String result= pocketmonInt.get(key);
                sb.append(result).append("\n");
            }
            else{
                int result= pocketmonStr.get(input);
                sb.append(result).append("\n");
            }
        }
        

        System.out.println(sb.toString());

        
    }

    
    }



        
     
