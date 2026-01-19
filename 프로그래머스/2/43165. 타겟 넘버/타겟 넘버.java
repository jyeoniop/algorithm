import java.util.*;
class Solution {
    static int count = 0;
    static int[] nums;
    static int tar;
    public void dfs(int sum, int depth){
        
        if(depth==nums.length){
            if(sum==tar){
                count++;
            }return;
        }
        
        sum += nums[depth];
        dfs(sum, depth+1);
        
        sum -= (nums[depth]*2);
        dfs(sum, depth+1);
        
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        nums = numbers;
        tar = target;
        
        dfs(0,0);
        
        answer = count;
        
        return answer;
    }
}