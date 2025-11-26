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
        
        HashMap<String, String> passdic = new HashMap<>();
        ArrayList<String> finddic = new ArrayList<>();
        
        for(int i =0;i<N+M;i++){
            if(i<N){
                st= new StringTokenizer(br.readLine()," ");
                passdic.put(st.nextToken(), st.nextToken());
            }
            else{
                finddic.add(br.readLine());
            }
        }

        for(String element : finddic){
            sb.append(passdic.get(element)).append("\n");
        }



        System.out.println(sb.toString());

        
    }

    
    }



        
     
