import java.io.*;
import java.util.*;

public class Main{
    static int start;
    
    public static void  findstart(int size, int r, int c){
        if(size==1)return;
        int half = size/2;
        
        if(r<half&&c<half){
            findstart(half, r,c);
        }else if(r<half&&half<=c){
            start += half*half;
            findstart(half, r,c-half);
        }
        else if(half<=r&&c<half){
            start += half*half*2;
            findstart(half, r-half,c);
        }else {
            start += half*half*3;
            findstart(half, r-half,c-half);
        }
        
    }
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        start = 0;
        int size = (int)Math.pow(2, N);
        findstart(size, r, c);

        System.out.println(start);
        // System.out.println(zet[r][c]);





        
        
        
    
        
        
    }

    
    }
