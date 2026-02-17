import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        
        int todate = Integer.parseInt(today.split("\\.")[0])*28*12+Integer.parseInt(today.split("\\.")[1])*28+Integer.parseInt(today.split("\\.")[2]);

        Map<String, Integer> hmap = new HashMap<>();
        for (String s : terms) {
            hmap.put(s.split(" ")[0], Integer.parseInt(s.split(" ")[1]));
        }
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<privacies.length;i++){
            int tardate = Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[0])*28*12+Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[1])*28+Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[2]);
            int term = hmap.get(privacies[i].split(" ")[1]);

            tardate += (term*28-1);

            // System.out.println(tardate+"  "+todate);
            if(tardate<todate){
                arr.add((i+1));
            }
            
        
        }


        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i] = arr.get(i);
            // System.out.println(answer[i]);
        }

        
        return answer;
    }
}