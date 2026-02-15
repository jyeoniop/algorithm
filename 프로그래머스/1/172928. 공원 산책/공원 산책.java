import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int r = park.length;
        int c = park[0].length();
        
        int curr = 0;
        int curc = 0;
        
        // 1. 시작 지점(S) 찾기
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(park[i].charAt(j) == 'S') {
                    curr = i;
                    curc = j;
                }
            }
        }
        
        // 방향 매핑 (N, S, W, E)
        int[] dr = {-1, 1, 0, 0}; // 세로(row) 변화
        int[] dc = {0, 0, -1, 1}; // 가로(col) 변화
        
        for(String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int move = Integer.parseInt(parts[1]);
            
            int dircnt = 0;
            if(dir.equals("N")) dircnt = 0;
            else if(dir.equals("S")) dircnt = 1;
            else if(dir.equals("W")) dircnt = 2;
            else if(dir.equals("E")) dircnt = 3;
            
            int tempR = curr;
            int tempC = curc;
            boolean isPossible = true;
            
            // 2. 한 칸씩 이동하며 검사
            for(int i=0; i<move; i++) {
                tempR += dr[dircnt];
                tempC += dc[dircnt];
                
                // 공원을 벗어나거나 장애물(X)을 만나면 실패
                if(tempR < 0 || tempR >= r || tempC < 0 || tempC >= c || park[tempR].charAt(tempC) == 'X') {
                    isPossible = false;
                    break;
                }
            }
            
            // 3. 이동이 가능할 때만 실제로 위치를 업데이트
            if(isPossible) {
                curr = tempR;
                curc = tempC;
            }
        }
        
        return new int[]{curr, curc};
    }
}