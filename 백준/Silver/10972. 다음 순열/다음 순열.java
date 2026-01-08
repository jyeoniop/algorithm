import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int[] nums;
    public static void swap(int a, int b){
        int temp= nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        

       int N = Integer.parseInt(br.readLine());
       nums = new int[N];
       
       st = new StringTokenizer(br.readLine(), " ");
       for(int i=0;i<N;i++){
        nums[i] = Integer.parseInt(st.nextToken());
       }



       int targetindex=N;
       for(int i=N-1;i>0;i--){
        if(nums[i]>nums[i-1]){
            targetindex = i-1;
            break;
        }
       }

       if(targetindex!=N){
            int minvalue = N+1;
            int minindex = -1;
            for(int i=N-1;i>targetindex;i--){
                if(minvalue>nums[i]&&nums[targetindex]<nums[i]){
                    minvalue = nums[i];
                    minindex = i;
                }
            }

            swap(minindex, targetindex);

            int len = N-targetindex-1;
            for(int i=1;i<=Math.floorDiv(len, 2);i++){
                swap(targetindex+i,N-i);
            }


            for (int i : nums) {
             System.out.print(i+" ");
            }

       }else{
        System.out.println("-1");
       }





        // System.out.println(sb.toString());
    
    }
}