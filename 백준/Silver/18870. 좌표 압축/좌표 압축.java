import java.io.*;
import java.util.*;

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
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] xy = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            xy[i] = Integer.parseInt(st.nextToken());
        }
        int[] xycopy = xy.clone();
        Arrays.sort(xycopy);

        HashMap<Integer,Integer> copy = new HashMap<>();
        int rank = 0;
        for (int i : xycopy) {
            if(!copy.containsKey(i)){
                copy.put(i,rank);
                rank++;
            }
        }
        for (int i : xy) {
            sb.append(copy.get(i)).append(" ");
        }

        
        System.out.println(sb.toString());
        
    }

    
    }
