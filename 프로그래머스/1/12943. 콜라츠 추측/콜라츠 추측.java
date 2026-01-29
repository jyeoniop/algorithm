class Solution {
    public int solution(int num) {
        int answer = 0;
        long s = num;
        
        if(s!=1){
            for(int i=0;i<500;i++){
                if(s==1){
                    answer = i;
                    break;
                }
                
                if(s%2==0){
                    s/=2;
                }else{
                    s = s*3+1;
                }
            }if(s!=1){
                answer = -1;
            }
        }
        return answer;
    }
}