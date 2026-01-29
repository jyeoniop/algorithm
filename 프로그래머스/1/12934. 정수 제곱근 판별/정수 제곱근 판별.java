class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double num = Math.sqrt(n);
        if(num==(long)num){
            answer = (long)(num+1)*(long)(num+1);
        }else{
            answer = -1;
        }
        return answer;
    }
}