import java.util.*;
class Solution {
    int[][] maps_int;
    int n, m;
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};
    public int bfs(int i, int j){
        Queue<int[]> q = new LinkedList<>();
        int sum = 0;
        
        sum += maps_int[i][j];
        maps_int[i][j] = 0;
        q.add(new int[]{i, j});
        
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curi = cur[0];
            int curj = cur[1];
            
            for(int k=0;k<4;k++){
                int nxti = curi+dx[k];
                int nxtj = curj+dy[k];
                if(nxti>=0&&nxti<n&&nxtj>=0&&nxtj<m){
                    if(maps_int[nxti][nxtj]!=0){
                        sum += maps_int[nxti][nxtj];
                        maps_int[nxti][nxtj] = 0;
                        q.add(new int[]{nxti, nxtj});
                    }
                }
            }
        }
        return sum;
    }
    public int[] solution(String[] maps) {
        ArrayList<Integer> result = new ArrayList<>();
        n = maps.length;
        m = maps[0].length();
        maps_int = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int value = maps[i].charAt(j)=='X'?0:(maps[i].charAt(j)-'0');
                maps_int[i][j] = value;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(maps_int[i][j]!=0){
                    result.add(bfs(i,j));
                }
            }
        }
        
        if(result.size()==0)return new int[]{-1};
    
        int[] answer = new int[result.size()];
        for(int i=0;i<result.size();i++){answer[i] = result.get(i);}
        Arrays.sort(answer);
        
        return answer;
    }
}