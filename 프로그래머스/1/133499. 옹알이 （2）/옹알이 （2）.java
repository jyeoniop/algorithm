
import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String ba : babbling) {
            String pre = "";
            boolean chk = true;
            while(!ba.equals("")){
                if(ba.startsWith("aya")){
                    if(pre.equals("aya")){
                        chk = false;
                        break;
                    }
                    pre = "aya";
                    ba = ba.substring(3);
                }else if(ba.startsWith("ye")){
                    if(pre.equals("ye")){
                        chk = false;
                        break;
                    }
                    pre ="ye";
                    ba= ba.substring(2);
                }else if(ba.startsWith("woo")){
                    if(pre.equals("woo")){
                        chk = false;
                        break;
                    }
                    pre ="woo";
                    ba= ba.substring(3);
                }else if(ba.startsWith("ma")){
                    if(pre.equals("ma")){
                        chk = false;
                        break;
                    }
                    pre ="ma";
                    ba= ba.substring(2);
                }else{
                    chk = false;
                    break;
                }
                

                if(!chk){
                    break;
                }
            }if(chk){
                answer++;
            }
        }


        
        
        return answer;
    }
}