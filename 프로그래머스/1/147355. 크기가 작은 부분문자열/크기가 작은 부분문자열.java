class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        boolean chk = true;
        for(int i=0;i<=(t.length()-p.length());i++){
            // System.out.println("--");
            chk =true;
            for(int j=0;j<p.length();j++){
                // System.out.println((t.charAt(j+i)-'0')+"  "+(p.charAt(j)-'0'));
                if((t.charAt(i+j)-'0')<(p.charAt(j)-'0')){
                    // System.out.println("++");
                    break;
                }else if((t.charAt(i+j)-'0')>(p.charAt(j)-'0')){
                    chk = false;
                    // System.out.println("end");
                    break;
                }
            }if(chk){
                answer++;
                // System.out.println(i);   
            }
        }
        
        return answer;
    }
}