import java.util.*;
class Solution {
    public int[] solution(String s) {

        Map<String, Integer> ma = new HashMap<>();

        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            String chk = String.valueOf(s.charAt(i));
            if(!ma.containsKey(chk)){
                answer[i] = -1;
                ma.put(chk, i);
            }else{
                answer[i] = i-ma.get(chk);
                ma.put(chk, i);
            }
        }
        
        return answer;
    }
}