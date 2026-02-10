import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb= new StringBuilder();

        int[] numcount = new int[10];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<X.length();i++){
            int num = X.charAt(i)-'0';
            numcount[num]++;
        }
        for(int i=0;i<Y.length();i++){
            int num = Y.charAt(i)-'0';
            if(numcount[num]!=0){
                arr.add(num);
                numcount[num]--;
            }
        }
        Collections.sort(arr, Collections.reverseOrder());

        if(arr.size()==0)sb.append("-1");
        else if(arr.get(0)==0){
            sb.append("0");
        }
        else{
            for (Integer i : arr) {
                sb.append(i);
            }

        }

        answer = sb.toString();
        
        return answer;
    }
}