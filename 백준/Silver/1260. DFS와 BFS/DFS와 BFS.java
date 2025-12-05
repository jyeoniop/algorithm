import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    static ArrayList<ArrayList<Integer>> line;
    static boolean[] visited;
    static StringBuilder sb;
    public static void dfs(int c){
        visited[c] = true;
        sb.append(c).append(" ");
        for(int element : line.get(c)){
            if(!visited[element]){
                dfs(element);
            }
        }
    }
    public static void bfs(int c){
        Queue<Integer> q = new LinkedList<>();

        q.offer(c);
        visited[c] = true;
        sb.append(c).append(" ");

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int element : line.get(cur)){
                if(!visited[element]){
                    q.offer(element);
                    visited[element] = true;
                    sb.append(element).append(" ");
                }
            }
        }

    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        line = new ArrayList<>();
        for(int i=0;i<=N;i++){
            line.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            line.get(u).add(v);
            line.get(v).add(u);
        }
        for(int i=0;i<=N;i++){
            Collections.sort(line.get(i));
        }
        visited = new boolean[N+1];
        dfs(V);

        sb.append("\n");


        visited = new boolean[N+1];
        bfs(V);

        System.out.println(sb.toString());
        
    }

    
    }
