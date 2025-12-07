import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int T = Integer.parseInt(br.readLine());
 
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            String result = "";
            for(int j=0;j<S.length();j++){
                char ch = S.charAt(j);
                for(int x=0;x<R;x++){
                    result += ch;
                }
            }
            sb.append(result).append("\n");
        }




        System.out.println(sb.toString());
        
    }

    
    }
