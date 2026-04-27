class Solution {
    int size;
    boolean[] visited;
    int[][] dungeons;
    int max;
    public void dfs(int depth, int count, int k){
        if(depth==size){
            max = Math.max(max, count);
        }
        for(int i=0;i<size;i++){
            if(!visited[i]){
                visited[i] = true;
                if(dungeons[i][0]<=k){
                    dfs(depth+1, count+1, k-dungeons[i][1]);
                }else{
                    dfs(depth+1, count, k);
                }
                visited[i] = false;
            }
        }
    }
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        size = dungeons.length;
        visited = new boolean[size];
        this.dungeons = dungeons;
        max = 0;
        
        dfs(0,0,k);
        answer = max;
        return answer;
    }
}