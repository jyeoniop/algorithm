class Solution {
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = gcd(n, m);
        int max = n*m/min;
        answer[0] = min;
        answer[1] = max;
        
        return answer;
    }
}