import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        
        Stack<Integer> sta = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int a :arr){
            if(!sta.isEmpty()){
                if(sta.peek()!=a){
                    res.add(sta.pop());
                    sta.push(a);
                }
            }else{
                sta.push(a);
            }
        }
        res.add(sta.pop());
        answer = new int[res.size()];
        for(int i=0;i<res.size();i++){
            answer[i] = res.get(i);
        }
        return answer;
    }
}