import java.io.*;
import java.util.*;

public class Main{
    static int[] time;
    static boolean[] visited;
    static int K;
    static int N;
    public static  void bfs(int c){
        Queue<Integer> q = new LinkedList();
        q.add(c);
        
        while(!q.isEmpty()){
            int cur = q.poll();
            visited[cur] = true;

            if(cur==K){
                return;
            }
            int[] nextposition = {cur+1, cur-1, cur*2};

            for (int next : nextposition) {
                if(next>=0&&next<=100000){
                    if(!visited[next]){
                        q.add(next);
                        visited[next] = true;
                        time[next] = time[cur]+1;
                    }
                    
                }
            }
            
            
            
        }
    }
    
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        time = new int[100001];
        
        
        visited = new boolean[100001];
        time[N] = 0;

        if(N>=K){
            System.out.println(N-K);
        }
        else{
            bfs(N);
            
            System.out.println(time[K]);
        }
        
    }

    
    }
