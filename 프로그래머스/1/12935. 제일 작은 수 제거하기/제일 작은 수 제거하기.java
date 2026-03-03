import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length;
        if(len==1){
            int[] answer = new int[]{-1};
            return answer;
        }
        
        int[] answer = new int[len-1];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a:arr){
            pq.add(a);
        }
        
        int min = pq.poll();
        int idx = 0;
        
        for(int i=0;i<len;i++){
            if(arr[i]!=min){
                answer[idx] = arr[i];
                idx++;
            }
        }
        
        
        
        return answer;
    }
}