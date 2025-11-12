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
        
        // int N = Integer.parseInt(br.readLine());

        
        String sen  = "";
        
        while(true){
            sen = br.readLine();
            if(sen.equals(".")){break;}
            String result = checkbal(sen);
            sb.append(result).append("\n");
        }

        System.out.println(sb);
        
    }

    public static String checkbal(String sen){
    Stack<Character> bracket = new Stack<>();
    Boolean result = true;
    int i = -1;
    while(i<sen.length()-1){
        i++;
        char ch = sen.charAt(i);
        if(ch=='.'){
            if(!bracket.isEmpty()){
                result = false;
            }
            break;
        }
        if(ch=='('||ch=='['){
            bracket.push(ch);
        }
        else if(ch==')'||ch==']'){
            if(bracket.isEmpty()){
                result = false;
                break;
            }
            char chpop = bracket.pop();
            if((ch==')'&&chpop!='(')||(ch==']'&&chpop!='[')){
                result = false;
                break;
            }
        }
    }
    if(result){return "yes";}
    else{return "no";}
    

    }
}
