import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        int maxcount = (queue1.length+queue2.length)*2;
        for(int i : queue1){
            sum1 += i;
            q1.add(i);
        }
        for(int i: queue2){
            sum2+= i;
            q2.add(i);
        }
        
        while(sum1!=sum2){
            if(answer>maxcount){
                answer = -1;
                break;
            }
            if(sum1>sum2){
                sum1-=q1.peek();
                sum2+=q1.peek();
                q2.add(q1.poll());
                answer++;
            }else{
                sum1+=q2.peek();
                sum2-=q2.peek();
                q1.add(q2.poll());
                answer++;
            }
        }
        return answer;
    }
}