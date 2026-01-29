class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int n = x;
        int total = 0;
        while(n>0){
            total += n%10;
            n /=10;
        }
        if(x%total!=0)answer = false;
        
        
        return answer;
    }
}