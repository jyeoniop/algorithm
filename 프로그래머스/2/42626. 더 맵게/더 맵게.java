import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i:scoville){
            heap.add(i);
        }
           
        int count =0;
        int scoscore = 0;
        
        while(heap.size()!=1){
            int first = heap.poll();
            // System.out.println("f : "+first);
            if(first>=K){
                heap.add(first);
                break;
            }
            int second = heap.poll();
            scoscore= first+second*2;
            // System.out.println("s: "+second);
            // System.out.println("sco : "+scoscore);

            heap.add(scoscore);
            count++;
            
            
        }
        if(heap.size()==1&&heap.poll()<K){
                answer =-1;    
        }else{answer=count;}
        
        return answer;
    }
}