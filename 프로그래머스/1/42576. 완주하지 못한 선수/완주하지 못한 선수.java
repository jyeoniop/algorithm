import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        String answer = "";
        
        HashMap<String, Integer> name = new HashMap<>();
        for(String p : participant){
            name.put(p, name.getOrDefault(p,0)+1);
        }
        for(String c : completion){
            name.put(c, name.get(c)-1);
        }
        for(String k : name.keySet()){
            if(name.get(k)!=0){
                answer = k;
            }
        }
        
        return answer;
    }
}