import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int c = park[0].length();
        int r = park.length;
        
        int[][] parkint = new int[r][c];
        int curr = 0;
        int curc = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                char ch = park[i].charAt(j);
                if(ch=='S'){
                    curr = i;
                    curc = j;
                    parkint[i][j] = 0;
                }else if(ch=='O')parkint[i][j] = 0;
                else parkint[i][j] = 1;
            }
        }
        for (int[] is : parkint) {
            for (int is2 : is) {
                System.out.print(is2);
            }System.out.println();
        }

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        StringTokenizer st;
        for(String s : routes){
            st = new StringTokenizer(s, " ");
            String dir = st.nextToken();
            int move = Integer.parseInt(st.nextToken());
            int dircnt = 0;
            if(dir.equals("N")){
                dircnt = 3;
            }else if(dir.equals("S")){
                dircnt = 1;
            }else if(dir.equals("W")){
                dircnt = 2;
            }else {
                dircnt = 0;
            }
            int tempr = curr;
            int tempc = curc;
            boolean chk = true;
            
            for(int m = 0;m<move;m++){
                int nextr = tempr+dy[dircnt];
                int nextc = tempc+dx[dircnt];

                if(nextr>=0&&nextr<r&&nextc>=0&&nextc<c){
                    if(parkint[nextr][nextc]==0){
                        tempr = nextr;
                        tempc = nextc;    
                    }else{chk = false;break;}
                    
                }else{chk = false;break;}  
            }if(chk){
                curr = tempr;
                curc = tempc;
            }
            
            
            
            
        }
        
        int[] answer = new int[2];
        answer[0] = curr;
        answer[1] = curc;


        return answer;
        
        
        
    }
}