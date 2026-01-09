import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int[][] score;
    static int N;
    static int[] team1;
    static int[] team2;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    public static int sumcal(int a, int b){
        return score[a][b]+score[b][a];
    }
    public static int sumarry(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++){
                sum+=sumcal(arr[i], arr[j]);
            }
        return sum;
    }
    public static void dfs(int depth, int start){
        
        if(depth==N/2){
            int index = 0;
            for(int i=0;i<N;i++){
                if(!visited[i]){
                    team2[index] = i;
                    index++;
                }
            }
            
            int minus = sumarry(team1)-sumarry(team2);
            min = Math.min(min, Math.abs(minus));

            return;
        }

        for(int i=start;i<N;i++){   
            if(!visited[i]){
                visited[i] = true;
                team1[depth] = i;
                dfs(depth+1, i+1);
                visited[i] =false;
            }
        }
    }

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        

       N = Integer.parseInt(br.readLine());
       
       score = new int[N][N];
       visited = new boolean[N];
       
       team1 = new int[N/2];
       team2 = new int[N/2];
       team1[0] = 0;
       visited[0] = true;
       for(int i=0;i<N;i++){
           st = new StringTokenizer(br.readLine()," ");
        for(int j=0;j<N;j++){
            score[i][j] = Integer.parseInt(st.nextToken());
        }
       }


       dfs(1,1);
       System.out.println(min);
    





    
    }
}