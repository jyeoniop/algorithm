import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
int[] skipalph = new int[26];
        Arrays.fill(skipalph,1);
        int aindex = 97;

        for(int i=0;i<skip.length();i++){
            skipalph[(int)(skip.charAt(i))-(int)'a'] = 0;
        }

        for(int i=0;i<s.length();i++){
            int count = 0;
            int start = (int)s.charAt(i)+1;
            for(int j=start-aindex;;j++){
                j %= 26;
                count += skipalph[j];
                if(count==index){
                    answer += String.valueOf((char)(j+aindex));
                    break;
                }
            }
        }

        
        return answer;
    }
}