import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int c:citations)pq.add(c);
        
        int count = 0;
        for(int i=pq.peek();i>=0;i--){
            while(!pq.isEmpty()&&pq.peek()>=i){
                count++;
                pq.poll();
            }
            if(i<=count&&(citations.length-count)<=i)return i;
        }
        return answer;
    }
}