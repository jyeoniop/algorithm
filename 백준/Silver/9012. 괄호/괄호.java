import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());

        Stack<Character> bracket = new Stack<>();
        String result = "";
        for(int i = 0;i<N;i++){
            boolean bresult = true;
            String sen = br.readLine();
            bracket.clear();;
            for(int j =0;j<sen.length();j++){
                char  ch = sen.charAt(j);
                if(ch=='('){bracket.push(ch);}
                else{
                    if(bracket.isEmpty()){                        
                        bresult = false;
                        break;
                    }
                    bracket.pop();
                }
            }
            if(!bracket.isEmpty()){
                bresult=false;}
            if(bresult==true){result = "YES";}
            else{result = "NO";}
            sb.append(result).append("\n");
        }
        
        System.out.print(sb.toString());
        





    }

       
    }




