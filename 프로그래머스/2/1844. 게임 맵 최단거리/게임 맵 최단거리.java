import java.util.*;
class Solution {
    static int N;
    static int M;
    static boolean[][] visited;
    static int[][] count;
    static int[][] map;
    
    public void bfs(int[] start){
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        
        q.add(start);
        count[0][0] = 1;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
            
            for(int i=0;i<4;i++){
                int netx = curx + dx[i];
                int nety = cury + dy[i];
                if(netx>=0&&netx<N&&nety>=0&&nety<M){
                    if(!visited[netx][nety]&&map[netx][nety]!=0){
                        visited[netx][nety]= true;
                        count[netx][nety] = count[curx][cury]+1;
                        q.add(new int[]{netx,nety});
                        
                    }
                }
            }
        }
    }
    public int solution(int[][] maps) {
        int answer = 0;
        map = maps;
        N = maps.length;
        M = maps[0].length;
        visited = new boolean[N+1][M+1];
        count = new int[N][M];
        
        bfs(new int[]{0,0});
        
        // for(int i=0;i<N;i++){
        //     for(int j=0;j<M;j++){
        //         System.out.print(count[i][j]+" ");
        //     }System.out.println();
        // }
        if(count[N-1][M-1]==0){answer = -1;}
        else{answer = count[N-1][M-1];}

        return answer;
    }
}