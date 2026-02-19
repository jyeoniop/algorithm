import java.util.*;
class Solution {
    public boolean getchk(String[][] park, int r, int c, int len){
        boolean chk = true;
        for(int i=r;i<r+len;i++){
            for(int j=c;j<c+len;j++){
                if(!park[i][j].equals("-1")){
                    chk = false;
                    break;
                }if(!chk)break;
            }
        }
        if(chk)return true;
        else return false;
    }
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        mats = Arrays.stream(mats)
             .boxed()
             .sorted(Collections.reverseOrder())
             .mapToInt(Integer::intValue)
             .toArray();
        
        for(int idx = 0;idx<mats.length;idx++){
            int mat=mats[idx];
            int maxr = park.length-mat;
            int maxc = park[0].length-mat;

            for(int i=0;i<=maxr;i++){
                for(int j=0;j<=maxc;j++){
                    if(park[i][j].equals("-1")){
                        if(getchk(park, i, j, mat)){
                            return mat;
                        }
                    }
                }
            }
        }

        return -1;
    }
}