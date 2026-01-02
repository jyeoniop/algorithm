import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.function.IntUnaryOperator;
public class Main{
    static boolean[] visited;
    static int start;
    static int end;
    static char[] cmdChar = {'D', 'S', 'L', 'R'};
    static String[] path;
    static StringBuilder sb = new StringBuilder();
    public static IntUnaryOperator[] dslr(int num){
        IntUnaryOperator[] dslr = new IntUnaryOperator[4];
        dslr[0] = n -> (2*num>9999)?(2*num)%10000:2*num;
        dslr[1] = n -> (num==0)?9999:num-1;
        dslr[2] = n -> num%1000*10+num/1000;
        dslr[3] = n -> num%10*1000+num/10;
        return dslr;
    }
    public static void bfs(int num){
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        visited[num]=true;
        path[num] = "";

        while(!q.isEmpty()){
            int n = q.poll();
            if(n==end){
                sb.append(path[n]).append("\n");
                return;
            }
            IntUnaryOperator[] op = dslr(n);
            int dslrresult =0;

            for(int i=0;i<4;i++){
                dslrresult = op[i].applyAsInt(0);
                if(!visited[dslrresult]){
                    visited[dslrresult] = true;
                    path[dslrresult] = path[n]+cmdChar[i];
                    q.add(dslrresult);
                }
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
            path = new String[10000];
    
            bfs(start);

        }


        System.out.println(sb.toString());
    
    }
}