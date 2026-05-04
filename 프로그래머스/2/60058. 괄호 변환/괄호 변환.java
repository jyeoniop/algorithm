// import java.util.*;
// class Solution {
//     public int getbalance(String p){
//         int count  = 0;
//         for(int i=0;i<p.length();i++){
//             char ch = p.charAt(i);
//             if(ch=='('){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//             if(count==0)return i;
//         }
//         return -1;
//     }
//     public boolean getcheck(String p){
//         Deque<String> stk = new ArrayDeque<>();
//         for(int i=0;i<p.length();i++){
//             char ch = p.charAt(i);
            
//             if(ch=='('){
//                 stk.push("(");
//             }else{
//                 if(stk.isEmpty())return false;
//                 stk.pop();
//             }
//         }
//         if(!stk.isEmpty())return false;
//         return true;
//     }
//     public String solution(String p) {
//         String answer = "";
//         StringBuilder sb = new StringBuilder();
//         if(p.equals(""))return "";
        
//         int splitindex =getbalance(p);
//         String stru = p.substring(0,splitindex+1);
//         String strv = p.substring(splitindex+1);
        
//         if(getcheck(stru))sb.append(stru);
//         else{
            
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public String solution(String p) {
        // 1단계: 빈 문자열이면 빈 문자열 반환
        if (p.isEmpty()) return "";

        // 2단계: u, v 분리
        int splitIdx = getSplitIndex(p);
        String u = p.substring(0, splitIdx + 1);
        String v = p.substring(splitIdx + 1);

        // 3단계: u가 올바른 괄호 문자열인지 확인
        if (isValid(u)) {
            // 3-1: v에 대해 재귀 수행 후 u에 붙여서 반환
            return u + solution(v);
        } else {
            // 4단계: u가 올바르지 않은 경우
            StringBuilder sb = new StringBuilder();
            sb.append("("); // 4-1
            sb.append(solution(v)); // 4-2 (재귀)
            sb.append(")"); // 4-3
            
            // 4-4: u의 첫/끝 제거 후 나머지 괄호 방향 뒤집기
            sb.append(reverseParentheses(u));
            
            return sb.toString(); // 4-5
        }
    }

    // 처음으로 균형이 잡히는 인덱스 찾기 (u 분리용)
    private int getSplitIndex(String s) {
        int open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') open++;
            else close++;
            if (open == close) return i;
        }
        return -1;
    }

    // 올바른 괄호 문자열인지 확인
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else {
                if (count == 0) return false;
                count--;
            }
        }
        return count == 0;
    }

    // 괄호 방향 뒤집기 (u 변환용)
    private String reverseParentheses(String u) {
        StringBuilder res = new StringBuilder();
        // 첫 번째와 마지막 문자 제외 루프
        for (int i = 1; i < u.length() - 1; i++) {
            if (u.charAt(i) == '(') res.append(")");
            else res.append("(");
        }
        return res.toString();
    }
}