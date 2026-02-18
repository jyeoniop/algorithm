class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int len = Integer.parseInt(video_len.split(":")[0])*60+Integer.parseInt(video_len.split(":")[1]);
        int intpos = Integer.parseInt(pos.split(":")[0])*60+Integer.parseInt(pos.split(":")[1]);
        int start = Integer.parseInt(op_start.split(":")[0])*60+Integer.parseInt(op_start.split(":")[1]);
        int end = Integer.parseInt(op_end.split(":")[0])*60+Integer.parseInt(op_end.split(":")[1]);

        for (String com : commands) {
            if(intpos>=start&&intpos<=end){
                intpos = end;
            }
            if(com.equals("next")){
                intpos +=10;
                if(intpos>len)intpos = len;
            }else{
                intpos -=10;
                if(intpos<0)intpos = 0;
            }
        }
        if(intpos>=start&&intpos<=end){
                intpos = end;
            }
        answer = String.format("%02d", intpos/60)+":"+String.format("%02d",intpos%60);
        
        
        return answer;
    }
}