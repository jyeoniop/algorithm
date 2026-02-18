import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        Map<String, Map<String, Integer>> gift = new HashMap<>();
        for(int i=0;i<friends.length;i++){
            gift.put(friends[i], new HashMap<String, Integer>());
            for(int j=0;j<friends.length;j++){
                if(i!=j){
                    gift.get(friends[i]).put(friends[j], 0);
                }
            }
        }
        for(String g :gifts){
            String fromf = g.split(" ")[0];
            String tof = g.split(" ")[1];
            gift.get(fromf).put(tof, gift.get(fromf).getOrDefault(tof,0)+1);
        }
        
        Map<String, Integer> giftsco = new HashMap<>();
        for(String key : gift.keySet()){
            for(String key1 : gift.get(key).keySet()){
                giftsco.put(key, giftsco.getOrDefault(key,0)+gift.get(key).get(key1));
                giftsco.put(key1, giftsco.getOrDefault(key1,0)-gift.get(key).get(key1));
            }
        } 
        
        
        int max = 0;
        for(int i=0;i<friends.length;i++){
            int count = 0;
            for(int j=0;j<friends.length;j++){
                if(i!=j){
                    if((gift.get(friends[i]).get(friends[j])>gift.get(friends[j]).get(friends[i]))||((gift.get(friends[i]).get(friends[j])==gift.get(friends[j]).get(friends[i]))&&(giftsco.get(friends[i])>giftsco.get(friends[j])))){
                        count++;
                    }
                }
            }max = Math.max(max, count);
        }
        
        answer = max;
        
        
        return answer;
    }
}