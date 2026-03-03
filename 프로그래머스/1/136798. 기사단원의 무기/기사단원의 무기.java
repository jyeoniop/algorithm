class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] pnum = new int[number+1];
        for(int i=1;i<=number;i++){
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    pnum[i]++;
                    if(j*j!=i)pnum[i]++;
                }
                
                }
        }
        
        for(int p:pnum){

            if(p>limit){
                answer += power;
            }else{
                answer += p;
            }
        }
        
        return answer;
    }
}