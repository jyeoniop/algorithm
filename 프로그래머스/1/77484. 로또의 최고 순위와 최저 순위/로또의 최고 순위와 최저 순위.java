import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int score = 0;
        int zerocnt = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : win_nums) {
            map.put(i,1);
        }
        for (int i : lottos) {
            if(map.containsKey(i))score++;
            if(i==0)zerocnt++;
        }

        int rank = 7-score==7?6:7-score;
        int minrank = Math.max(1,rank-zerocnt);
        int maxrank = Math.min(rank,6);
        
        answer[0] = minrank;
        answer[1] = maxrank;
        
        return answer;
    }
}