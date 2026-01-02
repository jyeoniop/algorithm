import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N  = Integer.parseInt(br.readLine());
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1;i<=N;i++){
            q.add(i);
        }
        while(q.size()!=1){
            q.poll();
            q.add(q.poll());
        }

        
        System.out.println(q.poll());
    
    }
}