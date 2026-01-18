import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stc = new Stack<>();
        if(s.charAt(0)==')')return false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(')stc.push(ch);
            else{
                if(stc.isEmpty())return false;
                stc.pop();
            }
        }
        if(!stc.isEmpty())return false;
        
        
        return answer;
    }
}