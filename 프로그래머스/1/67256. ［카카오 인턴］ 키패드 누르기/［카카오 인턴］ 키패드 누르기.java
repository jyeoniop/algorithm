class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        // 초기 위치: *은 10번, #은 12번 위치
        int leftPos = 10;
        int rightPos = 12;

        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                sb.append("L");
                leftPos = n;
            } else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                rightPos = n;
            } else {
                // 가운데 버튼 (2, 5, 8, 0)
                if (n == 0) n = 11;

                int leftDist = getDistance(leftPos, n);
                int rightDist = getDistance(rightPos, n);

                if (leftDist < rightDist) {
                    sb.append("L");
                    leftPos = n;
                } else if (rightDist < leftDist) {
                    sb.append("R");
                    rightPos = n;
                } else {
                    // 거리가 같을 때
                    if (hand.equals("right")) {
                        sb.append("R");
                        rightPos = n;
                    } else {
                        sb.append("L");
                        leftPos = n;
                    }
                }
            }
        }
        return sb.toString();
    }

    // 좌표 간 거리를 계산하는 별도 메서드
    public int getDistance(int pos, int target) {
        // 숫자를 0~11 인덱스 체계로 변환 (1->0, 2->1, ..., 0(11)->10, #(12)->11)
        int p = pos - 1;
        int t = target - 1;

        int pRow = p / 3;
        int pCol = p % 3;
        int tRow = t / 3;
        int tCol = t % 3;

        return Math.abs(pRow - tRow) + Math.abs(pCol - tCol);
    }
}