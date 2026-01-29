class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String str = s.toLowerCase();
        int pcount = 0;
        int ycount = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='p'){
                pcount++;
            }else if(str.charAt(i)=='y'){
                ycount++;
            }
        }
        
        if(pcount!=ycount){
            answer = false;
        }
        
        return answer;
    }
}