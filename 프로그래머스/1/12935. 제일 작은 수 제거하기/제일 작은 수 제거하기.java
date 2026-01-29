class Solution {
    public int[] solution(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        
        int[] answer;
        
        if (arr.length != 1) {
            answer = new int[arr.length - 1];
            int index = 0;
            for (int i : arr) {
                if (i != min) {
                    answer[index++] = i;
                }
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}