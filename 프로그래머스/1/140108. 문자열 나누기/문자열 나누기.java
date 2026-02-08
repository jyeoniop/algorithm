import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int size = s.length();
        Queue<String> q = new LinkedList<>();
        for(int i=0;i<size;i++){
            q.add(String.valueOf(s.charAt(i)));
        }

        int startcount = 0;
        int comparecount = 0;
        String startstr = "";
        while(!q.isEmpty()){
            if(startstr.equals("")){
                startstr = q.poll();
                startcount++;
                continue;
            }

            if(startstr.equals(q.poll())){
                startcount++;
            }else{
                comparecount++;
            }

            if(startcount==comparecount){
                answer++;
                startcount =0;
                comparecount = 0;
                startstr ="";
            }
        }
        if(startcount!=0||comparecount!=0){
            answer++;
        }
        
        return answer;
    }
}