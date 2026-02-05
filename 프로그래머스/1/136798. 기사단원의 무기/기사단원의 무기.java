class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] count = new int[100001];
        for(int i=1;i<100001;i++){
            for(int j=i;j<100001;j+=i){
                count[j]++;
            }
        }
        for(int i=1;i<=number;i++){
            if(count[i]>limit){
                answer += power;
            }else{
                answer += count[i];
            }
            
        }
        return answer;
    }
}