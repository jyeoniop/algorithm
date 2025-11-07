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
        
        int result = 665;
        int count = 0;
        while(true){
            result +=1;
            if(String.valueOf(result).contains("666")){
                count ++;
                if(count==N){
                    break;
                }
            }
        }





        System.out.println(result);
        
    }
    }




