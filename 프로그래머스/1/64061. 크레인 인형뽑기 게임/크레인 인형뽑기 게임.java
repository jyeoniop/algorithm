import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        
        Deque<Integer>[] bod = new ArrayDeque[board[0].length];
        for(int i=0;i<board[0].length;i++){
            bod[i] = new ArrayDeque<>();
        }
        for (int j=board.length-1;j>=0;j--) {
            int[] b = board[j]; 
            for(int i=0;i<board[0].length;i++){
                if(b[i]!=0){
                    bod[i].push(b[i]);

                }
            }
        }

        Deque<Integer> sta = new ArrayDeque<>();

        for(int i=0;i<moves.length;i++){
            int idx = moves[i]-1;
            
            if(!bod[idx].isEmpty()){
                int pop = bod[idx].pop();
                // System.out.println(pop);
                if(!sta.isEmpty()){
                    if(pop==sta.peek()){
                        sta.pop();
                        answer +=2;
                    }else{
                        sta.push(pop);
                    }
                }else{
                    sta.push(pop);
                }
            }
        }
        return answer;
    }
}