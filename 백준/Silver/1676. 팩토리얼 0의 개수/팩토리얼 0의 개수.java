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
        
        int count = 0;
        while(N>=5){
            count += N/5;
            N = N/5;
        }





        System.out.println(count);
        
    }
    }




