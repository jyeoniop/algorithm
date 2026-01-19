class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int lenmax = 0;
        int widmax = 0;
        int hgtmax = 0;
        
        for(int i=0;i<sizes.length;i++){
            widmax = Math.max(widmax, (Math.max(sizes[i][0],sizes[i][1])));
            hgtmax = Math.max(hgtmax, (Math.min(sizes[i][0],sizes[i][1])));
        }
        
        answer = widmax*hgtmax;
        return answer;
    }
}