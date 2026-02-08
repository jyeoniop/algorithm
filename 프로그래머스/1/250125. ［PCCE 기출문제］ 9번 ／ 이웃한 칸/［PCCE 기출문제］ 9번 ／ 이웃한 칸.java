class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int[] dh = {1,0,-1,0};
        int[] dw = {0,1,0,-1};

        String color = board[h][w];
        for(int i=0;i<4;i++){
            int nexth = h+dh[i];
            int nextw = w+dw[i];
            if(nexth>=0&&nexth<board.length&&nextw>=0&&nextw<board[0].length){
                if(board[nexth][nextw].equals(color)){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}