class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(int i=0;i<s.length();i++){
            Character chk = s.charAt(i);
            int ascii = 0;
            if(Character.isLowerCase(chk)){
                ascii = (int)chk+n>122?((int)chk+n)%123+97:(int)chk+n;
                chk = (char)ascii;
                answer += String.valueOf(chk);
            }else if(Character.isUpperCase(chk)){
                ascii = (int)chk+n>90?((int)chk+n)%91+65:(int)chk+n;
                chk = (char)ascii;
                answer += String.valueOf(chk);
            }else{
                answer += " ";
            }

        }
        return answer;
    }
}