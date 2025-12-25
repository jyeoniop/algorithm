import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N  = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        int[] b = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int sum=0;
        for(int i =0;i<N;i++){
            sum+= a[i]*b[N-1-i];
        }
        
        System.out.println(sum);
        
        
        
    
        
        
    }

    
    }
