import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int targetdepth;
    static int count;
    static int N;
    static int S;
    static  boolean[] visited;
    static  int[] num;
    public static  void dfs(int depth,int start, int sum){
        if(depth == targetdepth){
            // System.out.println("depth : "+depth+"  target : "+targetdepth+"  sum : "+sum);
            if(sum==S){
                count++;
            }
            sum=0;
            return;
        }
        
        // System.out.println("targetdepth - start: "+targetdepth);
        for(int i=start;i<N;i++){
            if(!visited[i]){
                visited[i] = true;
                sum+=num[i];
                // System.out.println("sum : "+sum);
                dfs(depth+1, i+1, sum);
                sum-=num[i];
                visited[i] = false;
            }
        }

    }

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        

        st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        st= new StringTokenizer(br.readLine()," ");


        num = new int[N];
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        count = 0;
        visited = new boolean[N+1];
        for(int i=1;i<=N;i++){
            targetdepth = i;
            dfs(0,0,0);
        }


        System.out.println(count);
    
    }
}