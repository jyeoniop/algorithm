import java.util.*;
class Solution {
    public long solution(long n) {

        
        int size = Long.toString(n).length();
        int[] ns = new int[size];

        for(int i=0;i<size;i++){
            ns[i] = (int)(n%10);
            n /= 10;
        }

        Arrays.sort(ns);

        long answer = 0;
        for(int i=size-1;i>=0;i--){
            answer = answer*10+ns[i];
        }
        return answer;
    }
}