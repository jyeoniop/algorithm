class Solution {
    public String solution(String s) {
        String answer = "";
        
        int size = s.length();
        String[] str = new String[size];
        for(int i = 0; i < size; i++){
            str[i] = s.charAt(i) + "";
        }

        int half = size/2;
        if(size%2==0){
            answer += str[half-1]+str[half];
        }else{
            answer += str[half];
        }
        
        return answer;
    }
}