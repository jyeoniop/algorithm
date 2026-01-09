import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int[][] consult;
    static int N;
    static int max=0;
    public static void dfs(int day, int paysum){
        
        if(day==N){
            max = Math.max(max, paysum);
            return;
        }else if(day>N){
            return;
        }
       
        if((day+consult[day][0])<=N){
            dfs((day+consult[day][0]), (paysum+consult[day][1]));

        }else{
            max = Math.max(max, paysum);
        }
        
        dfs((day+1), paysum);



    }

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        

       N = Integer.parseInt(br.readLine());
       
       consult = new int[N][2];
       for(int i=0;i<N;i++){
        st = new StringTokenizer(br.readLine()," ");
        consult[i][0] = Integer.parseInt(st.nextToken());
        consult[i][1] = Integer.parseInt(st.nextToken());
       }

       dfs(0,0);
       System.out.println(max);
    





    }
}