import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> orders = new Stack<>();

        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String curorder = st.nextToken();
            int pushint =0;
            
            if(curorder.equals("push")){pushint = Integer.parseInt(st.nextToken());}
            switch (curorder) {
                case "push":
                    orders.push(pushint);
                    break;
                case "top":            
                    if(orders.isEmpty()){sb.append("-1").append("\n");}
                    else{sb.append(orders.peek()).append("\n");}
                    break;
                case "empty":
                    if(orders.isEmpty()){sb.append("1").append("\n");}
                    else{sb.append("0").append("\n");}
                    break;
                case "size":
                    sb.append(orders.size()).append("\n");
                    break;
                case "pop":
                    if(orders.isEmpty()){sb.append("-1").append("\n");}
                    else{sb.append(orders.pop()).append("\n");}
                default:
                    break;
            }
        }

        System.out.print(sb.toString());
        
        
        
        
        
        
    }

    }




