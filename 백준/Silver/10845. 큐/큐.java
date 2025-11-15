import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> orders = new LinkedList<>();

        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String curorder = st.nextToken();
            int addint =0;
            
            if(curorder.equals("push")){addint = Integer.parseInt(st.nextToken());}
            switch (curorder) {
                case "push":
                    orders.add(addint);
                    break;
                case "front":            
                    if(orders.isEmpty()){sb.append("-1").append("\n");}
                    else{sb.append(orders.peek()).append("\n");}
                    break;
                case "back":            
                    if(orders.isEmpty()){sb.append("-1").append("\n");}
                    else{
                        int index =0;
                        for(int num : orders){
                            index++;
                            if(index == orders.size()){
                                sb.append(num).append("\n");
                            }
                        }
                    }
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
                    else{sb.append(orders.poll()).append("\n");}
                default:
                    break;
            }
        }

        System.out.print(sb.toString());
        
        
        
        
        
        
    }

    }




