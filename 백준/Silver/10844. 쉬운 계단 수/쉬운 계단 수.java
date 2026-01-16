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
        long[][] stairs = new long[101][10];
        for(int i=1;i<10;i++){
            stairs[1][i] = 1;
        }
        stairs[1][0] = 0;
        for(int i=2;i<=100;i++){
            stairs[i][0] = stairs[i-1][1];
            stairs[i][9] = stairs[i-1][8];
            for(int j=1;j<9;j++){
                stairs[i][j] = (stairs[i-1][j-1]+stairs[i-1][j+1])%1_000_000_000;
            }
        }

        long result = 0;
        for (long i : stairs[N]) {
            result += i;
        }
        result %=1_000_000_000;


        System.out.println(result);
    
    }

}