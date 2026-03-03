import java.util.*;
class Solution {
    public int GCD(int a, int b){
        if(b==0)return a;
        return GCD(b, a%b);
    }    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = GCD(n, m);
        int min = n*m/max;
        
        answer[0] = max;
        answer[1] = min;
        
        return answer;
    }
}