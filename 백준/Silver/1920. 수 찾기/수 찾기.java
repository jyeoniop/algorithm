import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;


public class Main{

    public static void main(String args[]) throws Exception{

        

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int N = Integer.parseInt(br.readLine());

        Set<Integer> aset = new HashSet<>();
        st = new StringTokenizer(br.readLine(), " ");

        for(int i =0;i<N;i++){
            aset.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0;i<M;i++){
            int target = Integer.parseInt(st.nextToken());
            if(aset.contains(target)){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }


        System.out.println(sb.toString());
   


        }

       
    }




