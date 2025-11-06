import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;

public class Main{

    public static void main(String args[]) throws Exception{
        
        

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken()); 
        long b = Long.parseLong(st.nextToken()); 
        long v = Long.parseLong(st.nextToken()); 
        

        long daliyh = a-b;
        long tarv = v-a;
        long befordays;
        if(tarv <=0){
            befordays = 0;
        }
        else{
            befordays = (tarv+daliyh-1)/daliyh;
        }
        long total = befordays+1;
        
        System.out.println(total);
    }


       
    }




