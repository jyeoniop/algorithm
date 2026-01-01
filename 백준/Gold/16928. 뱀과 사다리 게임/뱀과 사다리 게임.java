import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    static int[] step;
    static boolean[] visited;
    static int[] count;
    public static void bfs(){

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        count[1] = 0;
        visited[1] = true;

        while(!q.isEmpty()){
            int now = q.poll();
            for(int i=1;i<7;i++){
                int next = now +i;
                if(next>100){
                    continue;
                }
                if(step[next]!=0){
                    next = step[next];
                }
                if(!visited[next]){
                    count[next] = count[now]+1;
                    visited[next] = true;
                    q.add(next);
                }
            }
        }



    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N  = Integer.parseInt(st.nextToken());
        int M  = Integer.parseInt(st.nextToken());
        
        step = new int[101];
        for(int i=0;i<N+M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            step[start] = end;
        }
        
        visited = new boolean[101];
        count = new int[101];

        bfs();
       
    
        System.out.println(count[100]);
    
    }
}