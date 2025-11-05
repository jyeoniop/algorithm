import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;

public class Main{

    public static void main(String args[]) throws Exception{


        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        

        while(true){
            st = new StringTokenizer(br.readLine());
            int[] nums = new int[3];

            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());

            if(nums[0]==0&&nums[1]==0&&nums[2]==0){
                break;
            }

            Arrays.sort(nums);

            int a = nums[0];
            int b = nums[1];

            int c = nums[2];

            if((a*a+b*b)==(c*c)){
                sb.append("right").append("\n");
            }
            else {sb.append("wrong").append("\n");}
        }
        System.out.print(sb.toString());




       
    }


}


