class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int last = n;
        while(last>=a){
            int max = last/a;
            answer += max*b;
            last += max*(b-a);
        }
        return answer;
    }
}