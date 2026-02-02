class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] number = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        String chk = "";
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                chk = "";
                chk = String .valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1));
                for(int j=0;j<10;j++){
                    if(number[j].startsWith(chk)){
                        answer = answer*10+j;
                        i += number[j].length()-1;
                    }
                }
                
            }else{
                answer = answer*10+(s.charAt(i)-'0');
            }
                
        }
        
        return answer;
    }
}