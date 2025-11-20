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
        
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stacknum = new Stack<>();
        int[] numlist = new int[n];

        for(int i=0;i<n;i++){
            numlist[i] = Integer.parseInt(br.readLine());
        }

        int index=0;
        int i=1;
        while(i<=n){
                if(i>n){break;}
                if(!stacknum.isEmpty()&&stacknum.peek()==numlist[index]){
                    stacknum.pop();
                    sb.append("-").append("\n");
                    index++;
                }
                else if(i==numlist[index]){
                    stacknum.push(i);
                    stacknum.pop();
                    sb.append("+").append("\n");
                    sb.append("-").append("\n");
                    index++;
                    i++;
                }
                else{
                    stacknum.push(i);
                    sb.append("+").append("\n");
                    i++;
                }

        }
        while(!stacknum.isEmpty()){
            if(stacknum.peek()!=numlist[index]){
                sb.setLength(0);
                sb.append("NO");
                break;
            }
            else{
                stacknum.pop();
                sb.append("-").append("\n");
                index++;
            }
        }
        

        System.out.println(sb.toString());
        
    }

    
    }
