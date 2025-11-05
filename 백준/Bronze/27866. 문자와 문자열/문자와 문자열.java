import java.util.*;
import java.io.*;
// import java.time.LocalDate;

public class Main{
    public static void main(String args[]) throws Exception{

        

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        for(int j=0;j<S.length();j++){
            char ch = S.charAt(j);
            if(i==j+1){sb.append(ch);}
        }

        System.out.println(sb);
  
       
    }
}