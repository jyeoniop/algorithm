import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String> tset = new TreeSet<>();
        for(String phone:phone_book){
            tset.add(phone);
        }
        for(int i=0;i<phone_book.length;i++){
            for(int j=1;j<phone_book[i].length();j++){
                if(tset.contains(phone_book[i].substring(0,j))) return false;
            }
        }
        return answer;
    }
}