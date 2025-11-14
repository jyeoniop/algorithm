import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> money = new Stack<>();
        int sum = 0;
        for(int i = 0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num!=0){
                money.push(num);
            }
            else{
                money.pop();
            }
        }
        while(!money.isEmpty()){
            sum+=money.pop();
        }

        
        System.out.print(sum);
        
        
        
        
        
        
    }
       
    }




