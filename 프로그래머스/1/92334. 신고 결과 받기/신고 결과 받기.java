import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Map<String, Integer>> id = new HashMap<>();
        Map<String, Integer> count =new HashMap<>();
        ArrayList<String> arr= new ArrayList<>();

        for (String string : id_list) {
            Map<String, Integer> temp = new HashMap<>();
            id.put(string, temp);
        }
        for (String string : report) {
            String from = string.split(" ")[0];
            String to = string.split(" ")[1];

            
            id.get(from).put(to, 1);
        }
        for (String string : id.keySet()) {
            // System.out.println("key : "+string);
            for (String string2 : id.get(string).keySet()) {
                // System.out.println("subkey : "+string2+" value : "+id.get(string).get(string2));
                count.put(string2, count.getOrDefault(string2, 0)+1);

            }
        }
        for (String string : count.keySet()) {
            if(count.get(string)>=k){
                arr.add(string);
            }
        }

        for (int i = 0;i<id_list.length;i++) {
            String fromid = id_list[i];
            int result  = 0;
            for (String toid : id.get(fromid).keySet()) {
                if(arr.contains(toid)){
                    result++;
                }
            }answer[i] = result;
        }



        
        return answer;
    }
}