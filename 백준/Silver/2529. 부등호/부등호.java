import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int N;
    static  boolean[] visited;
    static int[] result;
    static String[] fix;
    static TreeSet<String> tree;
    public static  void dfs(int depth){
        if(depth == N+1){
            String str = "";
            for (int i : result) {
                str += i;
            }
            tree.add(str);
            return;
        }
        
        for(int i=0;i<=9;i++){
            if(!visited[i]){
                boolean chk;
                if(depth==0){
                    chk= true;
                }else{
                    if(fix[depth-1].equals("<")){
                        chk = result[depth-1]<i;
                    }else{
                        chk = result[depth-1]>i;
                    }
                }

                if(chk){
                    visited[i] = true;
                    result[depth] = i;
                    dfs(depth+1);
                    visited[i] = false;
                }
            }
        }

    }

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        

        N = Integer.parseInt(br.readLine());
        fix = new String[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            fix[i] = st.nextToken();
        }
        tree = new TreeSet<>();

        
        result = new int[N+1];
        visited = new boolean[10];
        dfs(0);
        
        sb.append(tree.last()).append("\n").append(tree.first());

        System.out.println(sb.toString());
    
    }
}