import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int[] lastpro = new int[progresses.length];
        for(int i=0;i<progresses.length;i++){
            double a, b;
            a = 100-progresses[i];
            b = speeds[i];
            lastpro[i] = (int)Math.ceil(a/b);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int p : lastpro){
            q.offer(p);
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            int count = 0;
            int day = q.poll();
            count++;
            while(!q.isEmpty()&&q.peek()<=day){
                q.poll();
                count++;
            }
            res.add(count);
        }
        
        answer = new int[res.size()];
        for(int i=0;i<res.size();i++){
            answer[i] = res.get(i);
        }
        
        return answer;
    }
}