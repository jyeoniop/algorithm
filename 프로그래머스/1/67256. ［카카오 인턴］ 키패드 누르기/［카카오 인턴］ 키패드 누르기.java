class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int right = 11;
        int left = 9;
        
        for(int num :numbers){
            int n = num-1;
            if(num==0)n=10;
            if(num==1||num==4||num==7){
                answer += "L";
                left = n;
            }else if(num==3||num==6||num==9){
                answer += "R";
                right = n;
            }else{
                int n_row = n/3;
                int n_col = n%3;
                
                int left_row = Math.abs((left/3)-n_row);
                int left_col = Math.abs((left%3)-n_col);
                
                int right_row = Math.abs((right/3)-n_row);
                int right_col = Math.abs((right%3)-n_col);
                
                int left_distance = left_row+left_col;
                int right_distance = right_row+right_col;
                if(hand.equals("right")){
                    if(left_distance>=right_distance){
                        answer += "R";
                        right = n;
                    }else{
                        answer += "L";
                        left = n;
                    }
                }else{
                    if(left_distance<=right_distance){
                        answer += "L";
                        left = n;
                    }else{
                        answer += "R";
                        right = n;
                    }
                }                   
            }
        }
        
        return answer;
    }
}