import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int e;
    static int s;
    static int m;
    static int year;
    public static void timecal(){
        year = 1;
        while (true) { 
            if((year-s)%28==0){
                if((year-m)%19==0){
                    if((year-e)%15==0){
                        break;
                    }
                }
            }
            year++;
        }
    }
    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        e = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        timecal();


        System.out.println(year);
    
    }
}