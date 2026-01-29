class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        boolean[] chk = new boolean[10];
        for (int i : numbers) {
            chk[i] = true;
        }

        for(int i=0;i<10;i++){
            if(!chk[i]){
                answer+=i;
            }
        }
        
        return answer;
    }
}