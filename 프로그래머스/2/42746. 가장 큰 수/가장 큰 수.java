import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, (a,b)->(b+a).compareTo(a+b));
        answer = String.join("",str);
        if(answer.charAt(0)=='0')answer ="0";
        return answer;
    }
}