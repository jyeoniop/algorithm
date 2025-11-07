import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;
// import java.time.LocalDate;
// import java.lang.reflect.Array;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());

        int plusval = 1000000;
        boolean nums[] = new boolean[2000001];
        for(int i=0;i<N;i++){
            int num =  Integer.parseInt(br.readLine())+plusval;
            nums[num] = true;
        }

        for(int i=0;i<2000001;i++){
    
            if(nums[i]){

                sb.append(String.valueOf(i-plusval)).append("\n");
            }
        }



        System.out.println(sb);
        
    }
    }




