class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int trans_len = Integer.parseInt(video_len.substring(0,2))*60+Integer.parseInt(video_len.substring(3,5));
        int trans_pos = Integer.parseInt(pos.substring(0,2))*60+Integer.parseInt(pos.substring(3,5));
        int trans_start = Integer.parseInt(op_start.substring(0,2))*60+Integer.parseInt(op_start.substring(3,5));
        int trans_end = Integer.parseInt(op_end.substring(0,2))*60+Integer.parseInt(op_end.substring(3,5));
        
        int count = commands.length;
        int pollcount = 0;
        while(count!=pollcount){
            if(trans_pos>=trans_start&&trans_pos<trans_end){
                trans_pos = trans_end;
            }else{
                if(commands[pollcount++].equals("prev")){
                    trans_pos = trans_pos<=10?0:trans_pos-10;
                }else{
                    trans_pos = trans_pos>=(trans_len-10)?trans_len:trans_pos+10;
                }
            }
            
        }
        if(trans_pos>=trans_start&&trans_pos<=trans_end){
                trans_pos = trans_end;
        }
        
        int hour = trans_pos/60;
        int min = trans_pos-hour*60;
        
        String answer = String.format("%02d", hour)+":"+String.format("%02d", min);
        return answer;
    }
}