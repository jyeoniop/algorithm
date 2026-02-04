import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
         Queue<Integer> q = new PriorityQueue<>();
        int[] result = new int[score.length];

        for(int i=0;i<score.length;i++){
            q.add(score[i]);
            if((i+1)>k) {
                q.poll();
            }
            result[i] = q.peek();
        }
        answer = result;
        
        return answer;
    }
}