import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;


public class Main{
    public static boolean maxfind(Queue<Integer> print, int indexzero){
        int max = 0;
        for(Integer element : print){
            max = Math.max(max, element);
        }
        if(max==indexzero){return true;}
        else{return false;}
        
    }
    public static void main(String args[]) throws Exception{

        

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int T = Integer.parseInt(br.readLine());
        
        Queue<Integer> print = new ArrayDeque<>();
        
        for(int j =0;j<T;j++){
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            print.clear();;
            st = new StringTokenizer(br.readLine()," ");
            for(int i =0;i<N;i++){
                print.offer(Integer.parseInt(st.nextToken()));
            }
    
            int index = M+1;
            int pollcount = 0;
            while(!print.isEmpty()){
                if(maxfind(print, (int)print.peek())){
                    if(index==1){break;}
                    else{print.poll();index--;pollcount++;}
                }
                else{
                    if(index==1){
                        print.offer((int)print.poll());
                        index=print.size();
                    }
                    else{
                        print.offer((int)print.poll());
                        index--;

                    }
                }
            }
            sb.append(index+pollcount).append("\n");
        }
        System.out.println(sb);
        
    }

    
}
