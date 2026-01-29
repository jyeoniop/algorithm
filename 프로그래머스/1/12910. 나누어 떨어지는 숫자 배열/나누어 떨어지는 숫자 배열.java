import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if(i%divisor==0){
                list.add(i);
            }
        }
        int[] answer;
        int size = list.size();
        if(size!=0){
            answer = new int[list.size()];
            int index = 0;
            for (Integer i : list) {
                answer[index++] = i;
            }
            Arrays.sort(answer);
            
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        
        
        
        return answer;
    }
}