import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        
        for(int i=0;i<=(right-left);i++){
            long index = i+left;
            int value = (int)Math.max((index/n),(index%n))+1;
            answer[i] = value;
        }
        return answer;
    }
}