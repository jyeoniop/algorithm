import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static boolean isprime(int N){
        if(N==1){return false;}
        if(N==2){return true;}
        if(N%2==0){return false;}
        for(int i=3;i*i<=N;i+=2){
            if(N%i==0){return false;}
        }
        return true;
    }
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        for(int i = M;i<=N;i++){
            if(isprime(i)){sb.append(i).append("\n");}
        }
        
        System.out.print(sb);
        }

    }


        
     
