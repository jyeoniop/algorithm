import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<commands.length;i++){
            int start= commands[i][0]-1;
            int end = commands[i][1];
            int[] copy;
            if(start!=(end-1)){
                copy = Arrays.copyOfRange(array, start, end);   
                Arrays.sort(copy);
            }else{
                copy = new int[]{array[start]};
            }
            
            arr.add(copy[commands[i][2]-1]);
        }
        answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}