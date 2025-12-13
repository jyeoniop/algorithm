import java.io.*;
import java.util.*;

public class Main{
static ArrayList<ArrayList<Integer>> line;
static int N;
static int M;

public static int bfs(int c){
    Queue<Integer> q = new LinkedList<>();
    boolean[] visited = new boolean[N+1];
    
    int[] step = new int[N+1];
        
        q.offer(c);
        visited[c] = true;
        step[c] = 0;

        int sumcount =0;

        while(!q.isEmpty()){
            int cur = q.poll();
            sumcount += step[cur];
            for(int element : line.get(cur)){
                if(!visited[element]){
                    q.offer(element);
                    visited[element] = true;
                    step[element] = step[cur]+1;
                }
            }
        }
        return sumcount;

    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        line = new ArrayList<>();
        for(int i=0;i<=N;i++){
            line.add(new ArrayList<>());
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            line.get(u).add(v);
            line.get(v).add(u);
        }


        int min[] = new int[N+1];
        for(int i=1;i<=N;i++){
            min[i] = bfs(i);
        }

        int minK = 0;
        int minV = Integer.MAX_VALUE;
        for(int i=1;i<=N;i++){
            if(minV>min[i]){
                minK = i;
                minV = min[i];
            }
        }

        System.out.println(minK);
        
    }

    
    }
