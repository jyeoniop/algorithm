class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int index = section[0];
        answer++;

        for (int i : section) {
            if(i>(index+m-1)){
                index = i;
                answer++;
            }
        }
        
        return answer;
    }
}