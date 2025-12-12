import java.io.*;
import java.util.*;

public class Main{

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        int[] fruits = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            fruits[i] = Integer.parseInt(st.nextToken());
        }

        int[] fruitsCount = new int[10];
        int maxfruits = 0; //3이상 되면 안됨
        int maxwindowsize = 0; //3이상 되면 windowsize 랑 max비교

        for(int i=0, j=0;i<N;i++){
            int fruit = fruits[i];

            if(fruitsCount[fruit]==0){
                maxfruits++;
            }
            fruitsCount[fruit]++;

            while(maxfruits>2){
                int left = fruits[j];
                fruitsCount[left]--;
                if(fruitsCount[left]==0){
                    maxfruits--;
                }
                j++;

            }
            
            maxwindowsize = Math.max(maxwindowsize, (i-j+1)); 
        }





        
        System.out.println(maxwindowsize);
        
    }

    
    }
