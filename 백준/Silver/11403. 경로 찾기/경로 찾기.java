import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<ArrayList<Integer>> line;
    static StringBuilder sb;
    static int N;
    static boolean[] visited;
    public static boolean[] dfs(int c, int b){
        if(b!=c){
            visited[c] = true;
        }
        for(int element : line.get(c)){
            if(b==element){
                visited[b] = true;
            }else if(!visited[element]){
                dfs(element, b);
            }
        }
        return visited;
    }

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] points = new int[N][N];
        line = new ArrayList<>();
        for(int i=0;i<N;i++){
            line.add(new ArrayList<>());
        }


        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<N;j++){
                int num = Integer.parseInt(st.nextToken());
                if(num==1){
                    line.get(i).add(j);
                }
            }
        }
        for(int i=0;i<N;i++){
            visited = new boolean[N];
            visited = dfs(i,i);
            for(int j=0;j<visited.length;j++){
                boolean b= visited[j];
                if(b){
                    sb.append("1");
                }else{
                    sb.append("0");
                }
                if(j!=visited.length-1){
                    sb.append(" ");
                }
                
            }
            sb.append("\n");
        }


        System.out.println(sb.toString());
        
        
    }

    
    }
