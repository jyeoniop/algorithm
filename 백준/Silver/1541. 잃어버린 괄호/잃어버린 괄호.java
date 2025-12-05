import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{

    public static int cal(String exp){
        int curnum = 0, num = 0;
        char modi = '+';

        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isDigit(ch)){
                curnum = (curnum*10+(ch-'0'));
            }
            else{
                if(modi=='+'){
                    num += curnum;
                }
                else{
                    num -= curnum;
                }
                curnum = 0;
                modi = ch;
            }
        }
        if(modi=='+'){
            num += curnum;
        }
        else{
            num -= curnum;
        }
        return num;
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        String exp = br.readLine();
        int finalresult;

        String[] parts = exp.split("\\-",2);
        if(parts.length==1){
            finalresult = cal(exp);
        }
        else{
            finalresult = cal(parts[0])-cal(parts[1].replace('-','+'));
        }


        System.out.println(finalresult);
        
    }

    
    }
