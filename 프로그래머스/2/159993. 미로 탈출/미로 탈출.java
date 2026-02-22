import java.util.*;
class Solution {
    public boolean[][] visited;
    public int[][] count;
    public int n;
    public int m;
    public int[][] maps;
    public void bfs(int a, int b){
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a, b});
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
            
            for(int i=0;i<4;i++){
                int nex = curx+dx[i];
                int ney = cury+dy[i];
                
                if(nex>=0&&nex<n&&ney>=0&&ney<m){
                    if(!visited[nex][ney]&&maps[nex][ney]==1){
                        visited[nex][ney] = true;
                        count[nex][ney] = count[curx][cury]+1;
                        q.add(new int[]{nex,ney});
                    }
                }
            }
        }
        
    }
    public int solution(String[] maps) {
        int answer = 0;
        
        n = maps.length;
        m = maps[0].length();
        count = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];
        this.maps = new int[n+1][m+1];
        int Lx = 0;
        int Ly = 0;
        int tx = 0;
        int ty = 0;
        int sx = 0;
        int sy = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(maps[i].charAt(j)=='O')this.maps[i][j] = 1;
                else if(maps[i].charAt(j)=='X')this.maps[i][j] = 0;
                else if(maps[i].charAt(j)=='L'){
                    this.maps[i][j] = 1;
                    Lx = i;
                    Ly = j;
                }else if(maps[i].charAt(j)=='S'){
                    this.maps[i][j] = 1;
                    sx = i;
                    sy = j;
                }else {
                    this.maps[i][j] = 1;
                    tx = i;
                    ty = j;
                }
            }
        }
        bfs(sx, sy);
        
        if(count[tx][ty]==0||count[Lx][Ly]==0)answer = -1;
        else{
            int lcount = count[Lx][Ly];
        
            count = new int[n+1][m+1];
            visited = new boolean[n+1][m+1];

            bfs(Lx, Ly);
            answer = lcount+count[tx][ty];
        }
        
        
        return answer;
    }
}