class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int oddchk = 0;
        if(brown%2!=0){
            oddchk = 1;
            brown--;
        }
        
        brown -=4;
        int h = 1;
        int w = brown/2-h;
        while(w>=h){
            if(h*w==(yellow+oddchk)){
                answer[0] = w+2;
                answer[1] = h+2;
                break;
            }
            h++;
            w--;
            
        }
        
        
        return answer;
    }
}