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

        String N = br.readLine();

        int sum = 0;
        int loseweight = 0;

        for(int i = 0;i<13;i++){
            char ch = N.charAt(i);

            int weight = (i%2==0)?1:3;

            if(ch!='*'){
                int digit = ch-'0';
                sum += digit*weight;
            }
            else{
                loseweight = weight;
            }
        }
        int namugi = sum%10;
        int result = 0;
        for(int i =1;i<10;i++){
            if((namugi+loseweight*i)%10==0){
                result = i;
            }
        }

        System.out.println(result);





}
       
    }




