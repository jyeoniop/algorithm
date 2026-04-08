import java.util.*;
class Solution {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);
        
        int left= 1;
        int right = distance;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            int removecnt = 0;
            int prerock = 0;
            
            for(int i=0;i<rocks.length;i++){
                if(rocks[i]-prerock<mid){
                    removecnt++;
                }else{
                    prerock = rocks[i];
                }
            }if(distance-prerock<mid){
                removecnt++;
            }
            if(removecnt<=n){
                answer = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return answer;
    }
}