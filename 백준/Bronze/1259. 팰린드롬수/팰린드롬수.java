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
            String num = br.readLine();
            if(num.trim().equals("0")){break;}
            
            String sbre = new StringBuilder(num).reverse().toString();

            if(num.equals(sbre)){
                sb.append("yes").append("\n");
            }    
            else{
                sb.append("no").append("\n");
            }
            }
            System.out.println(sb.toString());


        }

       
    }




