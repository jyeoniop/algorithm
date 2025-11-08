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
        
        int dunchi[][] = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            dunchi[i][0] = Integer.parseInt(st.nextToken());
            dunchi[i][1] = Integer.parseInt(st.nextToken());
        }
        int k;
        for(int i =0;i<N;i++){
            k =0;
            for(int j=0;j<N;j++){
                if(i==j){continue;}
                else{
                    if(dunchi[i][0]<dunchi[j][0] && dunchi[i][1]<dunchi[j][1]){
                        k ++;
                    }
                }
            }
            System.out.print(String.valueOf(k+1));
            System.out.print(" ");
        }

    }
    }




