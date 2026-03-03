import java.util.*;
class Solution {
    public int solution(String s) {
        StringBuilder sb= new StringBuilder();
        Character[] str = new Character[s.length()];
        for(int i=0;i<s.length();i++){
            str[i] = s.charAt(i);
        }
        for(int i=0;i<s.length();){
            
            if(Character.isDigit(str[i])){
                sb.append(str[i]);
                i++;
            }else{
                // String word = s.charAt(i)+s.charAt(i+1)+s.charAt(i+2)+"";

                if(str[i]=='z'){sb.append(0); i+=4;}
                else if(str[i]=='o'){sb.append(1); i+=3;}
                else if(str[i]=='t'&&str[i+1]=='w'){sb.append(2); i+=3;}
                else if(str[i]=='t'&&str[i+1]=='h'){sb.append(3); i+=5;}
                else if(str[i]=='f'&&str[i+1]=='o'){sb.append(4); i+=4;}
                else if(str[i]=='f'&&str[i+1]=='i'){sb.append(5); i+=4;}
                else if(str[i]=='s'&&str[i+1]=='i'){sb.append(6); i+=3;}
                else if(str[i]=='s'&&str[i+1]=='e'){sb.append(7); i+=5;}
                else if(str[i]=='e'){sb.append(8); i+=5;}
                else {sb.append(9); i+=4;}
                
                
            }
        }

        int answer = Integer.parseInt(sb.toString());
        return answer;
    }
}