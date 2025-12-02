import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
 
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> clos = new HashMap<>();
            for(int j=0;j<N;j++){
                st = new StringTokenizer(br.readLine()," ");
                String value = st.nextToken();
                String category = st.nextToken();
                if(clos.containsKey(category)){
                    clos.put(category,clos.get(category)+1);
                }
                else{clos.put(category,1);}
            }
            long result = 1;
            for(String key : clos.keySet()){
                int value = clos.get(key);
                result *= (1+value);
            }
            result--;
            sb.append(result).append("\n");
        }

        
        System.out.println(sb.toString());

        
    }

    
    }
