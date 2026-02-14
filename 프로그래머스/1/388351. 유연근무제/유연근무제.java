class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        int[][] sch = new int[schedules.length][7];
        for(int j=0;j<schedules.length;j++){
            int[] t = timelogs[j];
            for(int i=0;i<7;i++){
                int day = (startday+i)>=8?(startday+i)%8:startday+i-1;
                sch[j][day] = t[i];
            }
        }
        
        for(int i=0;i<schedules.length;i++){
            boolean chk = true;
            for(int j=0;j<5;j++){
                int endmin = 0;
                int endhor = 0;
                if((schedules[i]%100+10)>=60){
                    endhor = (schedules[i]/100+1);
                    endmin = (schedules[i]%100+10)%60;
                }else{
                    endhor = schedules[i]/100;
                    endmin = schedules[i]%100+10;
                }
                int endtime = endhor*100+endmin;
                
                if(sch[i][j]>endtime){
                    chk = false;
                }
            }if(chk)answer++;
        }
        return answer;
    }
}