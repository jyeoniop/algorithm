import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        TreeMap<String, Boolean> noCH = new TreeMap<>();
        
        TreeSet<String> distincnoCH = new TreeSet<>();

        for(int i=0;i<M+N;i++){
            String name = br.readLine();
            if(!noCH.containsKey(name)){
                noCH.put(name, true);
            }
            else{distincnoCH.add(name);}
        }
        sb.append(distincnoCH.size()).append("\n");
        for(String name : distincnoCH){
            sb.append(name).append("\n");
        }


        System.out.println(sb.toString());

        
    }

    
    }



        
     
