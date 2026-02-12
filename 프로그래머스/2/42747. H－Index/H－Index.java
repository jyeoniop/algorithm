import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int[] count = new int[10001];
        for(int i :citations){
            count[i] ++;
        }
        int num = 0;
        for(int i=10000;i>=0;i--){
            num += count[i];
            if(num>=i){
                num=i;
                break;
            }
        }
        answer = num;
        return answer;
    }
}