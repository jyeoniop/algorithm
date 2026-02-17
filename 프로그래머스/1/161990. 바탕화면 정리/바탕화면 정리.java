class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int r = wallpaper.length;
        int c = wallpaper[0].length();
        int[][] wall = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                char ch = wallpaper[i].charAt(j);
                if(ch=='.'){
                    wall[i][j] = 0;
                }else{
                    wall[i][j] = 1;
                }
            }
        }

        int minr = r;
        int minc = c;
        int maxr = 0;
        int maxc = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(wall[i][j]==1){
                    minr = Math.min(minr, i);
                    minc = Math.min(minc, j);
                    maxr = Math.max(maxr, i);
                    maxc = Math.max(maxc, j);
                }
            }
        }
        answer[0] = minr;
        answer[1] = minc;
        answer[2] = maxr+1;
        answer[3] = maxc+1;
        
        return answer;
    }
}