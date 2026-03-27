class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] subcount = new int[number+1];
        int count = 0;
        for(int i=1;i<=number;i++){
            count = 0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    count++;
                    if(j*j!=i)count++;
                }
            }subcount[i] = count<=limit?count:power;
        }
        
        for(int sub:subcount){
            answer += sub;
        }
        
        return answer;
    }
}