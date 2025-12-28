import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;

public class Main{

    public static String fizbus(int n){
        if((n%3==0)&&(n%5==0)){
            return "FizzBuzz";
        }
        else if((n%3==0)&&(n%5!=0)){
            return "Fizz";
        }
        else if((n%3!=0)&&(n%5==0)){
            return "Buzz";
        }
        else{
            return String.valueOf(n);
        }
    }
    public static void main(String args[]) throws Exception{
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        String[] s= new String[3];
        s[0] = br.readLine();
        s[1] = br.readLine();
        s[2] = br.readLine();

        int i =0;
        int position = 0;
        for(i = 0;i<3;i++){
            String curnum = s[i];
            if(curnum.equals("Fizz")||curnum.equals("Buzz")||curnum.equals("FizzBuzz")){
                continue;
            }
            int number = Integer.parseInt(curnum);
            position = number-i;
        }

        int result = position+3;
        System.out.println(fizbus(result));

}
       
    }




