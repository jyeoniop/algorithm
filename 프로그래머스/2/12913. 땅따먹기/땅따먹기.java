class Solution {
    int solution(int[][] land) {
        // 두 번째 줄부터 마지막 줄까지 내려가며 계산
        for (int i = 1; i < land.length; i++) {
            // 현재 줄의 0번 칸 = 이전 줄의 (1, 2, 3번 중 최대값) + 현재 0번 점수
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            
            // 현재 줄의 1번 칸 = 이전 줄의 (0, 2, 3번 중 최대값) + 현재 1번 점수
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            
            // 현재 줄의 2번 칸 = 이전 줄의 (0, 1, 3번 중 최대값) + 현재 2번 점수
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            
            // 현재 줄의 3번 칸 = 이전 줄의 (0, 1, 2번 중 최대값) + 현재 3번 점수
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        // 마지막 줄의 4개 값 중 가장 큰 것이 정답
        int lastRow = land.length - 1;
        return Math.max(Math.max(land[lastRow][0], land[lastRow][1]), 
                        Math.max(land[lastRow][2], land[lastRow][3]));
    }
}