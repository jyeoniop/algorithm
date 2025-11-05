import java.util.*;
import java.io.*;
// import java.time.LocalDate;

public class Main{
    public static void main(String args[]) throws Exception{
    
        

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        int count=  0;

        for(int i = 0;i<N;i++){
            int curint = Integer.parseInt(st.nextToken());
            if(v==curint){
                count+=1;
            }
        }
  
        System.out.println(count);
        
       
    }
}