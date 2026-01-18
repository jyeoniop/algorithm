import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> po = new HashMap<>();
        for(int n : nums){
            po.put(n, po.getOrDefault(n,0)+1);
        }
        int halflen = nums.length/2;
        int keysize = po.keySet().size();
        if(halflen>=keysize){
            answer = keysize;
        }else{
            answer = halflen;
        }
        
        return answer;
    }
}