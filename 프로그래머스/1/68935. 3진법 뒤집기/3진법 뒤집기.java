class Solution {
    public int solution(int n) {
        int answer = 0;
        

        String thr = Integer.toString(n, 3);
        String[] thrs = new String[thr.length()];
        for(int i=0;i<thr.length();i++){
            thrs[i] = String.valueOf(thr.charAt(thr.length()-1-i));
        }
        String thrr = "";
        for (String s : thrs) {
            thrr += s;
        }
        
        
        answer = Integer.parseInt(thrr,3);
        
        
        answer = Integer.parseInt(String.valueOf(thrr),3);
        
        return answer;
    }
}