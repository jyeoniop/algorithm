import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        

        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            String fix = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()){num = Integer.parseInt(st.nextToken());}

            switch (fix) {
                case "push_back": 
                    deque.addLast(num);                    
                    break;
                case "push_front": 
                    deque.addFirst(num);                    
                    break;
                case "front": 
                    if(deque.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(deque.peekFirst()).append("\n");
                    }    
                    break;
                case "back": 
                    if(deque.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(deque.peekLast()).append("\n");
                    }              
                    break;
                case "empty": 
                    if(deque.isEmpty()){
                        sb.append("1").append("\n");
                    }else{
                        sb.append("0").append("\n");
                    }
                    break;
                case "size": 
                    sb.append(deque.size()).append("\n");     
                    break;
                case "pop_back": 
                    if(deque.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(deque.pollLast()).append("\n");
                    }                
                    break;
                case "pop_front": 
                    if(deque.isEmpty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(deque.pollFirst()).append("\n");
                    }
                                      
                    break;
                default:
                    break;
            }
        }
        


        
        System.out.println(sb.toString());
    
    }
}