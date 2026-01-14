import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static ArrayList<ArrayList<Integer>> link;
    static boolean  chk;
    static boolean[] visited;
    private static void bfs(int start, int depth) {
        
        if(depth==4){
            chk= true;
            return;
        }

        visited[start]= true;
        for (int i : link.get(start)) {
            if(!visited[i]){
              bfs(i, depth+1);  
              visited[i] = false;
            }
        }


    }
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st=  new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        link = new ArrayList<>();
        for(int i=0;i<N;i++){

            link.add(new ArrayList<>());
        }
        for(int i =0;i<M;i++){
        
            st= new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            link.get(a).add(b);
            link.get(b).add(a);
        
        
        }
        visited = new boolean[N];
        for(int i=0;i<N;i++){
            chk = false;
            bfs(i,0);
            visited[i] = false;
            if(chk)break;
        }
        
        if(chk){System.out.println("1");}
        else{System.out.println("0");}
        // System.out.println(chk);
    
    }

}