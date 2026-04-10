import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph;
    public static int[] parent;
    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int next:graph.get(cur)){
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                    parent[next] = cur;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        parent = new int[N + 1];
        visited = new boolean[N + 1];

        bfs(1);

        for(int i=2;i<=N;i++){
            sb.append(parent[i]).append("\n");
        }
        System.out.print(sb.toString());
    }

}