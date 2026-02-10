import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        
        Stack<Integer> sta = new Stack<>();

        int num = 0;
        for(int i=0;i<dartResult.length();i++){
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }else if(!Character.isDigit(ch)&&ch!='*'&&ch!='#'){
                sta.push(num);
                num = 0;
            }

            if(ch=='D'){
                sta.push((int)Math.pow(sta.pop(),2));
            }else if(ch=='T'){
                sta.push((int)Math.pow(sta.pop(),3));
            }else if(ch=='#'){
                sta.push(sta.pop()*-1);
            }else if(ch=='*'){
                int pop1 = sta.pop();
                if(!sta.isEmpty()){
                    sta.push(sta.pop()*2);
                }
                sta.push(pop1*2);
            }
        }
        while(!sta.isEmpty()){
            answer += sta.pop();
        }
        
        return answer;
    }
}