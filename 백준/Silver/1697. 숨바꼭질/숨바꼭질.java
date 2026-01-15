import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
       static int[] time;
       static  int K;
       static boolean[] visited;

       public static void bfs(int c) {

        Queue<Integer> q= new LinkedList<>();
        q.add(c);

        while(!q.isEmpty()){
            int i= q.poll();

            if(i==K)return;

            int[] next = {i-1, i+1, i*2};
                for (int net : next) {
                if(net>=0&&net<=100000){
                    if(!visited[net]){
                        visited[net] = true;
                        time[net] = time[i]+1;
                        q.add(net);
                    }
                }
            }
            
        }
       }
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st= new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        time = new int[100001];
        time[N] = 0;
        visited = new boolean[100001];
        visited[N] = true;
        
        if(N>=K){
            sb.append(N-K);
        }else{
            bfs(N);
            sb.append(time[K]);
        }



        System.out.println(sb.toString());
    
    }

}