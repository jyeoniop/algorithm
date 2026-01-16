import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N =Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        st =new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int[] count = new int[1001];


        for (int num : nums) {
            int max = 0;
            for(int i=1;i<num;i++){
                max = Math.max(max, count[i]);
            }
            count[num] = max+1;
        }
        int  max = 0;
        for (int i : count) {
            max = Math.max(max,i);
        }

        System.out.println(max);
    
    }

}