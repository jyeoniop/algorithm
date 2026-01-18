import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        int len = clothes.length;
        HashMap<String, Integer> clo = new HashMap<>();
        for(int i=0;i<len;i++){
            clo.put(clothes[i][1], clo.getOrDefault(clothes[i][1],0)+1);
        }
        int total =1;
        for(String s : clo.keySet()){
            total  *= (clo.get(s)+1);
        }
        answer = total-1;
        return answer;
    }
}