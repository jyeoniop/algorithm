import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    public static void dfs(int c){
        visited[c] = true;
        for(int value : graph.get(c)){
            if(!visited[value]){
                dfs(value);
            }
        }
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList<>();
        
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }
        visited = new boolean[N+1];
        int count =0;
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);

        }
        
        for(int i=1;i<=N;i++){
                if(!visited[i]){
                    count++;
                    dfs(i);
            }
        }

        System.out.println(count);
        
    }

    
    }
