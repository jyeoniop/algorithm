import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N =Integer.parseInt(br.readLine());
        long[][] pina = new long[91][2];
        pina[1][0] = 0;
        pina[1][1] = 1;

        for(int i=2;i<91;i++){
            pina[i][0] = pina[i-1][0]+pina[i-1][1];
            pina[i][1] = pina[i-1][0];
        }

        long result = pina[N][0]+pina[N][1];

        System.out.println(result);
    
    }

}