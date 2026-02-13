import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String, Integer> hmap = new HashMap<>();
        for(int i=0;i<players.length;i++){
            hmap.put(players[i], i);
        }
        for(String c : callings){
            int ori = hmap.get(c);
            int cha = ori-1;
            String chacalling = players[cha];
            
            String temp = players[ori];
            players[ori] = chacalling;
            players[cha] = temp;
            hmap.put(c, cha);
            hmap.put(chacalling, ori);
        }
       answer = players;
        return answer;
    }
}