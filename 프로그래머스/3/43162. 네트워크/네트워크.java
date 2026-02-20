import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<computers.length;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<computers.length;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&computers[i][j]==1){
                    graph.get(i).add(j);
                }
            }
        }
        for(int i=0;i<graph.size();i++){
            System.out.println("i : "+i);
            for(int j:graph.get(i)){
                System.out.println(j);
            }
        }
        
        return answer;
    }
}