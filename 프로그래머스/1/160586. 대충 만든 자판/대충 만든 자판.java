import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        
        int[] result = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();
        for (String str : keymap) {
            for(int i=0;i<str.length();i++){
                String s = String.valueOf(str.charAt(i));
                int min = Math.min((i+1), map.getOrDefault(s,101));
                map.put(s,min);
            }
        }
        for (int j=0;j< targets.length;j++) {
            String tar = targets[j];
            int count = 0;
            for(int i=0;i<tar.length();i++){
                String s= String.valueOf(tar.charAt(i));
                if(map.getOrDefault(s, -1)==-1){
                    count =-1;
                    break;
                }else{
                    count += map.get(s);
                }
            }result[j] = count;
        }
        
        answer = result;
        
        return answer;
    }
}