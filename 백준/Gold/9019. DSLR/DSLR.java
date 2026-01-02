import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static boolean[] visited;
    static int start;
    static int end;
    static StringBuilder sb = new StringBuilder();
    static class Node{
        int val;
        String comnmand;

        public Node(int val,String comnmand ) {
            this.comnmand = comnmand;
            this.val = val;
        }
    }

    public static void bfs(int num){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(num, ""));
        visited[num]=true;

        while(!q.isEmpty()){
            Node now = q.poll();
            if(now.val==end){
                sb.append(now.comnmand).append("\n");
                return;
            }
            
            int d = (now.val * 2) % 10000;
            if(!visited[d]){
                    visited[d] = true;
                    q.add(new Node(d, now.comnmand+"D"));
                }
            int s = (now.val==0)?9999:now.val-1;
            if(!visited[s]){
                    visited[s] = true;
                    q.add(new Node(s, now.comnmand+"S"));
                }
            int l = now.val%1000*10+now.val/1000;
            if(!visited[l]){
                    visited[l] = true;
                    q.add(new Node(l, now.comnmand+"L"));
                }
            int r = now.val%10*1000+now.val/10;
            if(!visited[r]){
                    visited[r] = true;
                    q.add(new Node(r, now.comnmand+"R"));
                }
            
        }

    }

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N  = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            visited = new boolean[10000];
    
            bfs(start);

        }


        System.out.println(sb.toString());
    
    }
}