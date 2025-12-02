import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visisted;
    static int infectdCont = 0;

    public static void dfs(int cur){
        visisted[cur] = true;
        infectdCont++;

        for(int element:graph.get(cur)){
            if(!visisted[element]){
                dfs(element);
            }
        }
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }

        visisted = new boolean[N+1];

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        dfs(1);

        
        System.out.println(infectdCont-1);

        
    }

    
    }
