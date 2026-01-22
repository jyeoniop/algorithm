import java.util.*;
class Solution {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] count;
    static boolean[] visited;
    public void bfs(int start){
        
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int i:graph.get(cur)){
                if(!visited[i]){
                    visited[i] = true;
                    count[i] = count[cur]+1;
                    q.add(i);
                }
            }
        }
        
    }
    public int solution(int n, int[][] edge) {
        int answer = 0;
        graph = new ArrayList<>();
        for(int i= 0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edge.length;i++){
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }
        count = new int[n+1];
        count[1] = 0;
        
        visited = new boolean[n+1];
        visited[1] = true;
        
        bfs(1);
        
        int max = 0;
        for(int i:count){
            max= Math.max(max, i);
        }
        for(int i:count){
            if(i==max){
                answer++;
            }
        }
        
        return answer;
    }
}