class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1;i<food.length;i++){
            if(food[i]/2>=1){
                for(int j=0;j<food[i]/2;j++){
                    answer += String.valueOf(i);
                }
            }
        }
        String reanswer = new StringBuilder(answer).reverse().toString();
        answer += "0"+reanswer;
        
        return answer;
    }
}