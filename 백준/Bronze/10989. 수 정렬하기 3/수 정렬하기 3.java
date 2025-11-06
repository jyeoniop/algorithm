import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());

        int nums[] = new int[10001];
        for(int i =0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            nums[num]++;
        }
        
        for(int i =1;i<10001;i++){
            if(nums[i]!=0){
                for(int j=0;j<nums[i];j++){
                    sb.append(i).append("\n");
                }

            }
        }
        System.out.println(sb.toString());
    }
       
    }




