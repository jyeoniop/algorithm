class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(String st : sp){
            int num = Integer.parseInt(st);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        answer = min+" "+max;
        return answer;
    }
}