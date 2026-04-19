import java.util.*;

class Solution {
    public static Map<String, Integer> hmap;
    public static StringBuilder sb = new StringBuilder();
    private static void dfs(String order, int target, int start) {
        if(sb.length()==target){
            hmap.put(sb.toString(), hmap.getOrDefault(sb.toString(),0)+1);
            return;
        }

        for(int i=start;i<order.length();i++){
            sb.append(order.charAt(i));
            dfs(order, target, i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public String[] solution(String[] orders, int[] course) {
        hmap = new HashMap<>();
        for(String order:orders){
            char[] charArr = order.toCharArray();
            java.util.Arrays.sort(charArr);
            String sortedOrder = new String(charArr);
            for(int target:course){
                dfs(sortedOrder, target,0);

            }
        }

        List<String> result = new ArrayList<>();
        for(int c:course){
            int max = 0;
            for(String key:hmap.keySet()){
                if(key.length()==c){
                    max = Math.max(max, hmap.get(key));
                }
            }
            if(max>=2){
                for(String key:hmap.keySet()){
                    if(key.length()==c&&hmap.get(key)==max){
                        result.add(key);
                    }
                }
            }
        }
        Collections.sort(result);
        
        String[] answer = new String[result.size()];
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}