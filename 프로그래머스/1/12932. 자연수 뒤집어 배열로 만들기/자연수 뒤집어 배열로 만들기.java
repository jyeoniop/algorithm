class Solution {
    public int[] solution(long n) {
        
        int size = String.valueOf(n).length();
        int[] answer = new int[size];

        int index = 0;
        while(n>0){
            answer[index] = (int)(n%10);
            n /= 10;
            index++;
        }
        
        
        return answer;
    }
}