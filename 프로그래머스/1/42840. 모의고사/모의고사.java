import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        
        int[] d1 = {1,2,3,4,5};
        int[] d2 = {2,1,2,3,2,4,2,5};
        int[] d3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i=0;i<answers.length;i++){
            int i1 = i%5;
            int i2 = i%8;
            int i3 = i%10;
            if(answers[i]==d1[i1])count1++;
            if(answers[i]==d2[i2])count2++;
            if(answers[i]==d3[i3])count3++;
        }
        int max = Math.max(count1,count2);
        max = Math.max(max, count3);
        if(max == count1)li.add(1);
        if(max == count2)li.add(2);
        if(max == count3)li.add(3);
        
        answer = new int[li.size()];
        for(int i=0;i<li.size();i++){
            answer[i] = li.get(i);
        }
        return answer;
    }
}