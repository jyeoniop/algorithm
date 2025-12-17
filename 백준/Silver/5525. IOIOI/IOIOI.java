import java.io.*;
import java.util.*;

public class Main{

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        Character[] originArray = new Character[M];
        String str = br.readLine();
        for(int i =0;i<M;i++){
            originArray[i] = str.charAt(i);
        }

        int matchcount = 0;
        int result = 0;
        for(int i =1;i<M-1;i++){
            if(originArray[i-1]=='I'&&originArray[i]=='O'&&originArray[i+1]=='I'){
                matchcount++;

                if(matchcount==N){
                    result++;
                    matchcount--;
                }
                i++;
            }
            else{
                matchcount = 0;
            }
        }





        System.out.println(result);
        
        
    }

    
    }
