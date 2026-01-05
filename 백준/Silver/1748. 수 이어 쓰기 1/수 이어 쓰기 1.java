import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        long N = Long.parseLong(br.readLine());
        int l = String.valueOf(N).length();
        // System.out.println(l);

        int sum =0;
        for(int i=1;i<l;i++){
            sum += Math.pow(10,i-1)*9*i;
        }
        int max= (int)Math.pow(10, l-1);
        sum += l*(N-max+1);


        System.out.println(sum);
    
    }
}