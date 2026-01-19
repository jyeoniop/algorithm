import java.util.*;
class Solution {
    static int max;
    static boolean[] visited;
    static int[][] dun;
    public void dfs(int bal, int depth){

        max = Math.max(max,depth);

        
        for(int i=0;i<dun.length;i++){
            if(!visited[i]){
                if(bal>=dun[i][0]){
                    visited[i] = true;
                    dfs(bal-dun[i][1], depth+1);
                    visited[i] = false;

                }
        }
    }}
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        visited = new boolean[dungeons.length];
        dun = dungeons;
        
        max = 0;
        dfs(k, 0);
        answer = max;
        
        
        return answer;
    }
}