import java.io.*;
import java.util.*;

public class Main{

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        String pn = "I";
        for(int i=1;i<=N;i++){
            pn = pn+"OI";
        }
        int pnsize = N*2+1;

        String str = br.readLine();
        String[] originArray = str.split("");


        String[] copyArray = new String[pnsize];
        int count = 0;
        
        for(int i=0;i<M;i++){
            int start = i;
            int end = i+pnsize;

            if(M<end){break;}

            System.arraycopy(originArray, start, copyArray, 0, pnsize);
            if(pn.equals(String.join("", copyArray))){
                count++;
            }
        }




        System.out.println(count);
        
        
    }

    
    }
