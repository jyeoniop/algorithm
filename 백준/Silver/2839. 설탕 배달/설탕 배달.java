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
        
        int N = Integer.parseInt(br.readLine());

        int Max5 = N/5+1;
        
        int leavekg = 0;
        int mincount =0;
        for(int i=0;i<Max5;i++){
            int count = 0;
            leavekg = N-i*5;
            if(leavekg%3==0){
                count = leavekg/3;
            }
            else{continue;}
            if(mincount==0){
                mincount = count+i;
            }
            else{mincount = Math.min(mincount, count+i);}
        }
        if(mincount ==0){
            mincount = -1;
        }

        System.out.println(mincount);


        }

       
    }




