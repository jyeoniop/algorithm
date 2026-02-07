class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] isnotprime = new boolean[1_000_001];
        isnotprime[0] = true;
        isnotprime[1] = true;
        for(int i=2;i*i<1_000_001;i++){
            if(!isnotprime[i]){
                for(int j=i*i;j<1_000_001;j+=i){
                    isnotprime[j] = true;
                }

            }
        }



        for(int i=1;i<=n;i++){
            if(!isnotprime[i]){
                answer++;
            }
        }

        
        return answer;
    }
}