import java.util.*;
class Solution {
    
    public int solution(int[] priorities, int location) {
        
        int answer = 0;
        int count = 1;
        
        Queue<Integer> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i : priorities){
            q.add(i);
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        while(!q.isEmpty()){
            if(location==0){
                if(q.peek()==map.lastKey()){
                    break;
                }else{
                    location += (q.size()-1);
                    q.add(q.poll());
                }
            }else{
                if(q.peek()==map.lastKey()){
                    q.poll();
                    if(map.get(map.lastKey())!=1){
                        map.put(map.lastKey(), map.get(map.lastKey())-1);
                    }else map.remove(map.lastKey());
                    count++;
                    location--;
                }else{
                    q.add(q.poll());
                    location--;
                }
            }
            
        }
        answer = count;
        return answer;
    }
}