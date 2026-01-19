import java.util.*;
class Solution {
    static String[] odd;
    static String[] resultlist;
    static String target;
    static String result;
    static int cnt;
    static int resultcnt;
    public void dfs(int depth){
        if(resultcnt!=0)return;
        if(depth==(target.length())){
            result = "";
            for(String s : resultlist){
                if(s!=null){
                    result +=s;    
                }
            }
            // System.out.println("cnt : "+cnt+"  resultString: "+result);
            if(result.equals(target)){
                resultcnt =cnt;
            }
        }
        if(depth==5)return;
        
        
        for(int i=0;i<5;i++){
                cnt++;
                resultlist[depth] = odd[i];
                result = "";
                for(String s : resultlist){
                    if(s!=null){
                        result +=s;    
                    }
                }
                // System.out.println("depth : "+depth+"  cnt : "+cnt+"  resultString: "+result);
                dfs(depth+1);
                resultlist[depth] = null;
        }
    }
    
    public int solution(String word) {
        int answer = 0;
        
        odd = new String[]{"A","E","I","O","U"};
        target = word;
        resultlist = new String[5];
        result = "";
        cnt = 0;
        resultcnt = 0;
        dfs(0);
        
        answer = resultcnt;
        return answer;
    }
}