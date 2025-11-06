import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;

public class Main{

    public static int GCD(int a, int b){
        if(b==0){return a;}
        else{return GCD(b, a%b);}
        
    }
    public static void main(String args[]) throws Exception{


        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = GCD(a, b);
        int lcm = (a*b)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);


    }

}


