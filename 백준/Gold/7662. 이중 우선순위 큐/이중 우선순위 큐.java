import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int j=0;j<T;j++){

            int N  = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i = 0;i<N;i++){
                st = new StringTokenizer(br.readLine(), " ");
                char mod = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());
                if(mod=='I'){
                    map.put(num, map.getOrDefault(num, 0)+1);
                }else{
                    if(map.isEmpty()){
                        continue;
                    }
                    int reskey = 0;
                    if(num==1){
                        reskey = map.lastKey();
                    }else{
                        reskey = map.firstKey();
                    }
                    if(map.get(reskey)==1){
                        map.remove(reskey);
                    }else{
                        map.put(reskey, map.get(reskey)-1);
                    }
                }
            }
            if(map.isEmpty()){
                sb.append("EMPTY").append("\n");
            }else{
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
        }



        
        System.out.println(sb.toString());
    
    }
}