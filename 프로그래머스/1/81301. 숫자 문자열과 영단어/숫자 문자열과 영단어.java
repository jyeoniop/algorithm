class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for(int i=0;i<s.length();){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
                i++;
            }else{
                if(s.substring(i,i+3).equals("one")){
                    sb.append(1);
                    i+=3;
                }else if(s.substring(i,i+3).equals("two")){
                    sb.append(2);
                    i+=3;
                }else if(s.substring(i,i+3).equals("six")){
                    sb.append(6);
                    i+=3;
                }else if(s.substring(i,i+3).equals("zer")){
                    sb.append(0);
                    i+=4;
                }else if(s.substring(i,i+3).equals("fou")){
                    sb.append(4);
                    i+=4;
                }else if(s.substring(i,i+3).equals("nin")){
                    sb.append(9);
                    i+=4;
                }else if(s.substring(i,i+3).equals("fiv")){
                    sb.append(5);
                    i+=4;
                }else if(s.substring(i,i+3).equals("sev")){
                    sb.append(7);
                    i+=5;
                }else if(s.substring(i,i+3).equals("eig")){
                    sb.append(8);
                    i+=5;
                }else if(s.substring(i,i+3).equals("thr")){
                    sb.append(3);
                    i+=5;
                }
            }
        }
        answer = Integer.parseInt(sb.toString());
        return answer;
    }
}