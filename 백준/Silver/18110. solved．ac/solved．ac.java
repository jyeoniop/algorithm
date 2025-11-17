import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] level = new int[n];
        long delete_dnum = Math.round(n*0.15);
        int delet_num = (int)delete_dnum;

        for(int i = 0;i<n;i++){
            level[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(level);

        int sum = 0;
        for(int i = delet_num;i<n-delet_num;i++){
            sum += level[i];
        }

        double total_n = n-2*delet_num;
        double davg = Math.round(sum/total_n);
        int avg = (int)davg;
        
        System.out.print(avg);
        
        
    }

    }




