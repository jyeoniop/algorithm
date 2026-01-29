class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int ch = 1;
        int start = 0;
        if(s.charAt(0)=='+')start = 1;
        else if(s.charAt(0)=='-'){
            ch = -1;
            start = 1;
        }
        
        for(int i=start;i<s.length();i++){
            answer = answer*10+ (s.charAt(i)-'0');
        }
        answer *= ch;
        return answer;
    }
}