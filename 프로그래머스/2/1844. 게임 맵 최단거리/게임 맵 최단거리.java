import java.util.*;
class Solution {
    public static int[][] result;
    public static boolean[][] visited;
    public static int[][] maps;
    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        
        q.add(new int[]{0,0});
        visited[0][0] = true;
        result[0][0] = 1;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
            for(int i=0;i<4;i++){
                int ntx = curx+dx[i];
                int nty = cury+dy[i];
                if(ntx>=0&&nty<maps[0].length&&nty>=0&&ntx<maps.length){
                    if(!visited[ntx][nty]&&maps[ntx][nty]==1){
                        visited[ntx][nty] = true;
                        q.add(new int[]{ntx, nty});
                        result[ntx][nty] = result[curx][cury]+1;
                    }
                }
            }
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        result = new int[maps.length][maps[0].length];
        visited = new boolean[maps.length+1][maps[0].length+1];
        this.maps = maps;
        bfs();
        answer = result[maps.length-1][maps[0].length-1]==0?-1:result[maps.length-1][maps[0].length-1];
        return answer;
    }
}