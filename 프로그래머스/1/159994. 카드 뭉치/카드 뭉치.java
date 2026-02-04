import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        boolean chk = true;
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();

        q1.addAll(Arrays.asList(cards1));
        q2.addAll(Arrays.asList(cards2));

        for (String s : goal) {
            if(s.equals(q1.peek()))q1.poll();
            else if(s.equals(q2.peek()))q2.poll();
            else chk = false;
        }

        if(chk) answer = "Yes";
        else answer = "No";
        
        return answer;
    }
}