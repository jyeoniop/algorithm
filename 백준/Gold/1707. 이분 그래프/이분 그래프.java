import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static ArrayList<ArrayList<Integer>> link;
    static boolean chk;
    static boolean[] visited;
    static int[] color;
    public static void dfs(int start, int colorchk) {
        if(!chk)return;
        int nextcolor = 3-colorchk;


        for (int i : link.get(start)) {
            if(!visited[i]){
                visited[i] = true;
                color[i] = nextcolor;
                dfs(i, nextcolor);
            }else{
                if(color[i]!=nextcolor){
                    chk= false;
                    return;
                }
            }


        }
       
    }
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());

        for(int r=0;r<T;r++){

            st= new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
    
            link = new ArrayList<>();
            for(int i=0;i<N;i++){
                link.add(new ArrayList<>());
            }
    
            for(int i=0;i<M;i++){
                st= new StringTokenizer(br.readLine()," ");
                int num1 = Integer.parseInt(st.nextToken())-1;
                int num2 = Integer.parseInt(st.nextToken())-1;
    
                link.get(num1).add(num2);
                link.get(num2).add(num1);
            }
    
            chk = true;
            visited = new boolean[N];
            color = new int[N];
            for(int i=0;i<N;i++){
                if(!visited[i]){
                    color[i] = 1;
                    visited[i] = true;
                    dfs(i, 1);
                }
            }
    
    
            if(chk){sb.append("YES").append("\n");}
            else {sb.append("NO").append("\n");}
        }


        System.out.println(sb.toString());
    
    }

}