import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
         HashMap<String, Integer> par = new HashMap<>();
        for(String str : participant){
            par.put(str, par.getOrDefault(str, 0)+1);
        }

        for(String str:completion){
            par.put(str, par.get(str)-1);
        }

        for(String k : par.keySet()){
            if(par.get(k)!=0){
                answer= k;
            }
        }
        
        return answer;
    }
}