import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
 
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N  = Integer.parseInt(br.readLine());
        int[][] person = new int[N][2];
        for(int i=0;i<N;i++){
            st= new StringTokenizer(br.readLine()," ");
            int we = Integer.parseInt(st.nextToken());
            int hi = Integer.parseInt(st.nextToken());
            person[i][0] = we;
            person[i][1] = hi;

        }
        int[] countp = new int[N];
        for(int i=0;i<N;i++){
            int count = 1;
            for(int j=0;j<N;j++){
                if(i==j){continue;}
                if(person[i][0]<person[j][0]&&person[i][1]<person[j][1]){
                    count++;
                }
            }
            countp[i] = count;
        }
        for (int i : countp) {
            sb.append(i).append("\n");
        }



        System.out.println(sb.toString());
    
    }
}