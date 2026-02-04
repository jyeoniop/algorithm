import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        Queue<String> q = new PriorityQueue<>((a,b)->{
            if(a.charAt(n)==b.charAt(n))return a.compareTo(b);
            return  a.charAt(n)-b.charAt(n);
        });
        q.addAll(Arrays.asList(strings));

        for(int i=0;i<strings.length;i++){
            answer[i] = q.poll();
        }
        return answer;
    }
}