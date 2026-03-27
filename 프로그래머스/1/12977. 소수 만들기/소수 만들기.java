class Solution {
    public boolean[] isprime;
    public int primecount=0;
    public boolean[] visited;
    public int[] nums;
    public void dfs(int start, int depth, int sum){
        if(depth==3){
            if(!isprime[sum]){
                primecount++;
            }return;
        }
        
        for(int i=start;i<nums.length;i++){
            if(!visited[i]){
                sum+=nums[i];
                visited[i] = true;
                dfs(i+1, depth+1, sum);
                sum-=nums[i];
                visited[i] = false;
            }
            
        }
        
    }
    public int solution(int[] nums) {
        int answer = -1;
        this.nums = nums;
        
        isprime = new boolean[3000];
        isprime[0] = true;
        isprime[1] = true;
        for(int i=2;i<3000/2;i++){
            if(!isprime[i]){
                for(int j=i+i;j<3000;j+=i){
                    isprime[j]  =true;
                }    
            }
        }
        visited = new boolean[nums.length+1];
        dfs(0,0,0);
        
        answer = primecount;
        
        return answer;
    }
}