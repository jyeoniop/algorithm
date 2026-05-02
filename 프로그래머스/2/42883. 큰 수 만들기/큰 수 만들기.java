import java.util.*;
class Solution {
    public String solution(String number, int k) {
        Deque<Integer> stk = new ArrayDeque<>();
        
        int index = 0;
        while(index<number.length()){
            if(!stk.isEmpty()&&stk.peek()<(number.charAt(index)-'0')&&k>0){
                while((!stk.isEmpty()&&stk.peek()<(number.charAt(index)-'0')&&k>0)){
                    stk.pop();
                    k--;    
                }
            }
            stk.push((number.charAt(index)-'0'));
            index++;
        }
        
        while(k > 0) {
            stk.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty())sb.append(stk.pop());
        sb.reverse();
        String answer = sb.toString();
        return answer;
    }
}