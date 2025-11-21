import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> atm = new ArrayList<>();

        for(int i=0;i<N;i++){
            atm.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(atm);

        int sum = 0, result =0;
        for(Integer time : atm){
            sum += time;
            result +=sum;
        }


        System.out.println(result);

        
    }

    
    }



        
     
