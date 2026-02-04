import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};

        int[] result = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<name.length;i++){
            map.put(name[i], yearning[i]);
        }
        for(int i=0;i<photo.length;i++){
            int total = 0;
            for (String strings : photo[i]) {
                total += map.getOrDefault(strings, 0);
            }
            result[i] = total;
        }
        
        answer = result;
        return answer;
    }
}