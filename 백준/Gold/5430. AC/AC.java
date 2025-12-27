import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int T = Integer.parseInt(br.readLine());
        for(int j=0;j<T;j++){
            String ac= br.readLine();
            int N  = Integer.parseInt(br.readLine());
            int[] ary =new int[N];
            String[] parts = br.readLine().replaceAll("[\\[\\]]", "").split(",");
            for(int i=0;i<N;i++){
                ary[i] = Integer.parseInt(parts[i]);
            }
    
            int startcount = 0;
            int endcount = 0;
            boolean direction = true;
    
            for(int i=0;i<ac.length();i++){
                char di = ac.charAt(i);
                if(di=='R'){
                    direction = !direction;
                }else{
                    if(direction){
                        startcount++;
                    }else{
                        endcount++;
                    }
                }
            }
            if(startcount+endcount>N){
                sb.append("error").append("\n");
            }else{
                int[] result = Arrays.copyOfRange(ary, startcount, N-endcount);
                if(!direction){
                    for(int i=0;i<result.length/2;i++){
                        int temp = result[i];
                        result[i] = result[result.length-1-i];
                        result[result.length-1-i] = temp;
                    }
                }
                String resultstr = Arrays.toString(result).replace(" ","");
                sb.append(resultstr).append("\n");
            }

        }
        
        System.out.println(sb.toString());
        
    }

    
    }
