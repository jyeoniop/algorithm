import java.util.*;
class Solution {
    static int tar;
    static int[] nums;
    static int N;
    static int[]result;
    static int count;
    public static void dfs(int start, int depth){
        if(depth==N){
            int sum = 0;
            for(int i :result){
                sum+=i;
            }
            if(sum==tar){
                count++;
            }
            return;
        }
        result[depth] = nums[start];
        dfs(start+1, depth+1);
        
        result[depth] = (nums[start])*-1;
        dfs(start+1, depth+1);
    }
    public int solution(int[] numbers, int target) {
        int answer;
        
        tar = target;
        nums = numbers;
        N = nums.length;
        result = new int[N];
        count = 0;
        
        dfs(0,0);
        
        answer= count;
        
        return answer;
    }
}