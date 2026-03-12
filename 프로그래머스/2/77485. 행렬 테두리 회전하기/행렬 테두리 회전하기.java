class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int[][] arr = new int[rows+1][columns+1];
        int count = 1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                arr[i][j] = count++;
            }
        }
        
        for(int q=0;q<queries.length;q++){
            int strow = queries[q][0];
            int stcol = queries[q][1];
            int endrow = queries[q][2];
            int endcol = queries[q][3];
            
            int temp = arr[strow][stcol];
            int min = Integer.MAX_VALUE;
            
            for(int x=strow+1;x<=endrow;x++){
                min = Math.min(min, arr[x][stcol]);
                arr[x-1][stcol] = arr[x][stcol];
            }
            for(int y=stcol+1;y<=endcol;y++){
                min = Math.min(min, arr[endrow][y]);
                arr[endrow][y-1] = arr[endrow][y];
            }
            for(int x=endrow-1;x>=strow;x--){
                min = Math.min(min, arr[x][endcol]);
                arr[x+1][endcol] = arr[x][endcol];
            }
            for(int y=endcol-1;y>stcol;y--){
                min = Math.min(min, arr[strow][y]);
                arr[strow][y+1] = arr[strow][y];
            }
            arr[strow][stcol+1] = temp;
            min = Math.min(min, temp);
            
            answer[q] = min;
            
        }


        
        
        return answer;
    }
}