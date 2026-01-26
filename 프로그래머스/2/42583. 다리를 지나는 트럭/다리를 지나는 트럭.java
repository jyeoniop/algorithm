import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> bridge = new LinkedList<>();

        for(int i=0;i<bridge_length;i++){
            bridge.add(0);
        }

        Queue<Integer> truck = new LinkedList<>();
        for(int i:truck_weights){
            truck.add(i);
        }
        int time = 0;
        int total= 0;
        while(true){
            time++;
            bridge.poll();
            if(!truck.isEmpty()){
                total = totalWeight(bridge)+truck.peek();
                if(total>weight){
                    bridge.add(0);
                }else{
                    bridge.add(truck.poll());
                }
            }else{
                total = totalWeight(bridge);
                if(total>0){
                    bridge.add(0);
                }else{
                    break;
                }
            }
        }
        answer = time;
        
        return answer;
    }
    public int totalWeight(Queue<Integer> bridge){
        int total = 0;
        for(int a:bridge){
            total+=a;
        }

        return total;
    }
}