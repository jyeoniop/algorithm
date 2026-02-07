class Solution {
    static boolean[] visited;
    static int count;
    static int[] result;
    static boolean[] isnotprime;
    static int n;
    static int[] num;
    public static void  dfs(int start, int depth){
        if(depth==3){
            int sum = 0;
            for (int i : result) {
                sum += i;
            }if(!isnotprime[sum]){
                System.out.println("sum : "+sum);
                count++;
            }
            return;
        }

        for(int i=start;i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = num[i];
                dfs(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
    public int solution(int[] nums) {
        int answer = -1;
        
        n = nums.length;
        visited = new boolean[n+1];
        count = 0;
        result = new int[3];
        num = nums;


        isnotprime = new boolean[3000];
        isnotprime[0] = true;
        isnotprime[1] = true;
        for(int i=2;i*i<3000;i++){
            if(!isnotprime[i]){
                for(int j=i*i;j<3000;j+=i){
                    isnotprime[j] = true;
                }

            }
        }


        dfs(0,0);

        answer = count;

        return answer;
    }
}