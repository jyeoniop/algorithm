import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> uuidlist = new ArrayList<>();
        ArrayList<String> oplist = new ArrayList<>();
        Map<String, String> hmap = new HashMap<>();
        for(String rec:record){
            String[] param = rec.split(" ");
            String uid = param[1];
            if(param[0].equals("Enter")){
                hmap.put(uid, param[2]);
                uuidlist.add(uid);
                oplist.add("님이 들어왔습니다.");
            }else if(param[0].equals("Change")){
                hmap.put(uid, param[2]);
            }else{
                uuidlist.add(uid);
                oplist.add("님이 나갔습니다.");
            }   
        }
        
        String[] answer = new String[uuidlist.size()];
        for(int i=0;i<uuidlist.size();i++)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(hmap.get(uuidlist.get(i))).append(oplist.get(i));
            answer[i] = sb.toString();
        }
        return answer;
    }
}