import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
       Arrays.sort(jobs, (a,b)->a[0]-b[0]);


        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->{
            if(a[1]==b[1])return a[0]-b[0];
            return a[1]-b[1];
        });

        int count = 0;
        int curtime = 0;
        int jobidx = 0;
        int totaltime = 0;

        while(count<jobs.length){
            while(jobidx<jobs.length&&jobs[jobidx][0]<=curtime){
                q.add(jobs[jobidx++]);
            }
            if(q.isEmpty()){
                curtime = jobs[jobidx][0];
            }else{
                int[] job = q.poll();
                totaltime += (curtime-job[0]+job[1]);
                curtime += job[1];
                count++;
            }

        }

        answer = totaltime/jobs.length;
        
        return answer;
    }
}