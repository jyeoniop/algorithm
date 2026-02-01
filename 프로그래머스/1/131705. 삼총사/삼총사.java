class Solution {
    static int[] sol;
    static boolean[] visited;
    static int count;
    static int[] result;
    public static void dfs(int depth, int start){
        if(depth==3){
            int total = 0;
            for (int i : result) {
                total += i;
            }
            if(total==0){
                for (int i : result) {
                System.out.print(i);
            }System.out.println();
                count++;
            }
            return;
        }

        for(int i=start;i<sol.length;i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = sol[i];
                dfs(depth+1,i+1);
                visited[i] = false;
            }
        }
    }
    public int solution(int[] number) {
        int answer = 0;
        
        sol = number;
        visited =new boolean[number.length+1];
        count = 0;
        result = new int[3];

        dfs(0,0);   
        answer = count;
        
        return answer;
    }
}