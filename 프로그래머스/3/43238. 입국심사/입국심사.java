class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        int maxTime = 0;
        for(int i : times){
            maxTime = Math.max(maxTime ,i);
        }
        
        long high = (long)n*maxTime;
        long low = 1;
        
        while(low<=high){
            long mid = (high+low)/2;
            long total =0;
            for(int i:times){
                total+=mid/i;
                if(total>=n)break;
            }
            if(total>=n){
                answer = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return answer;
    }
}