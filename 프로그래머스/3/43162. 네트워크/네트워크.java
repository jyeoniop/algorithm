import java.util.*;
class Solution {
    static ArrayList<ArrayList<Integer>> arr;
    static boolean[] visited;
    static int n;
    static int count=0;
    void bfs(int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int a:arr.get(cur)){
                if(!visited[a]){
                 visited[a] = true;
                 q.add(a);
                }
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        this.n=n;
        arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&computers[i][j]==1){
                    arr.get(i).add(j);
                }
            }
        }
        
        visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                bfs(i);        
            }
        }
        
        answer = count;
        
        return answer;
    }
}