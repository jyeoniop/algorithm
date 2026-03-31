
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



public class Main{
    public static int[][] map;
    public static int eatcount = 0;
    public static int sharksize = 2;
    public static int N;
    public static int sharkx, sharky;
    public static class Fish implements Comparable<Fish>{
        int x, y , dist;

        Fish(int x, int y, int dist){
            this.x = x;
            this.y= y;
            this.dist = dist;
        }

        @Override
        public  int compareTo(Fish o){
            if(this.dist!=o.dist)return this.dist-o.dist;
            if(this.x!=o.x)return this.x-o.x;
            return this.y-o.y;
        }

    }
    public static Fish bfs(){
        int[] dx  ={0,-1,1,0};
        int[] dy = {1,0,0,-1};

        boolean[][] visited  = new boolean[N][N];
        PriorityQueue<Fish> pq = new PriorityQueue<>();

        Queue<int[] > q = new LinkedList<>();
        
        q.add(new int[]{sharkx, sharky, 0});
        visited[sharkx][sharky] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curx = cur[0];
            int cury = cur[1];
            int curd = cur[2];

            for(int i=0;i<4;i++){
                int netx = curx +dx[i];
                int nety = cury +dy[i];

                if(netx>=0&&netx<N&&nety>=0&&nety<N){
                    if(!visited[netx][nety]){
                        if(map[netx][nety]<=sharksize){
                            visited[netx][nety] = true;
                            q.add(new int[]{netx,nety, curd+1});

                            if(map[netx][nety]<sharksize&&map[netx][nety]!=0){
                                pq.add(new Fish(netx, nety, curd+1));
                            }
                        }
                    }
                }
            }

        }
        return pq.poll();



    }
    public static void main(String[] args) throws Exception{
        
        StringBuilder sb = new StringBuilder();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int totalTime = 0;
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<N;j++){
                map[i][j] = Integer.parseInt(st.nextToken()); 
                if(map[i][j]==9){
                    sharkx = i;
                    sharky = j;
                    map[sharkx][sharky]=0;
                }
            }
        }

        while(true){
            Fish target = bfs();
            
            if(target==null){
                break;
            }

            totalTime+= target.dist;
            sharkx = target.x;
            sharky = target.y;
            map[sharkx][sharky] = 0;

            eatcount++;
            if(eatcount==sharksize){
                sharksize++;
                eatcount = 0;
            }

        }

        System.out.println(totalTime);
    }
    
}

    
