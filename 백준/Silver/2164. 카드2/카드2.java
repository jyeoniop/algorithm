import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;


public class Main{

    public static void main(String args[]) throws Exception{

        

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> cards = new ArrayDeque<>();
        for(int i =1;i<=N;i++){
            cards.offer(i);
        }

        while(cards.size()>1){
            cards.poll();
            int moved= cards.poll();
            cards.offer(moved);
        }
        if(!cards.isEmpty()){
            System.out.println(cards.poll());

        }

        }

       
    }




