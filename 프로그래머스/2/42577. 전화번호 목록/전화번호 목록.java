import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> hset = new HashSet<>();
        for(String p:phone_book){
            hset.add(p);
        }
        
        for(String phone:phone_book){
            for(int i=1;i<phone.length();i++){
                if(hset.contains(phone.substring(0,i))){
                    return false;
                }
            }
        }
        
        
        
        return answer;
    }
}