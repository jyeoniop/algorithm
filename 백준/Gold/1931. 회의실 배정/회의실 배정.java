import java.io.*;
import java.util.*;

public class Main{

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N  = Integer.parseInt(br.readLine());
        int[][] meets = new int[N][2];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            meets[i][0] = Integer.parseInt(st.nextToken());
            meets[i][1] = Integer.parseInt(st.nextToken());
            
        }
        Arrays.sort(meets, (l1, l2)->{
            if(l1[1] == l2[1]){
                return Integer.compare(l1[0], l2[0]);
            }
            return Integer.compare(l1[1], l2[1]);
        });

        int count =0;
        int end = 0;
        for (int[] is : meets) {

            if(is[0]>=end){
                count++;
                end = is[1];
            }
        }

        System.out.println(count);
        
        
        
    
        
        
    }

    
    }
