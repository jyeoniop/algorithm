import java.util.*;
class Solution {
        static int[] num;
    static boolean[] visited;
    static int[] result;
    static int n;
    static TreeSet<Integer> hash;
    public static  void dfs(int start, int depth){
        if(depth==2){
            hash.add(result[0]+result[1]);
            return;
        }
        for(int i = start;i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth]=num[i];
                dfs(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
n = numbers.length;
        num = numbers;
        visited = new boolean[n+1];
        result = new int[2];
        hash = new TreeSet<>();
        
        dfs(0,0);
        
        answer = hash.stream().mapToInt(Integer::intValue).toArray();

        
        return answer;
    }
}