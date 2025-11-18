import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    public static int wbwchk(char[][] board){
        int result1= 0, result2 = 0;
        for(int i =0;i<8;i++){
            for(int j =0;j<8;j++){
                if((i+j)%2==0 && board[i][j]!= 'W'||(i+j)%2!= 0 && board[i][j]!='B'){result1 ++;}
                if((i+j)%2!=0 && board[i][j]!= 'W'||(i+j)%2== 0 && board[i][j]!='B'){result2 ++;}
            }
        }
        
        return Math.min(result1,result2);
    }
    
    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];

        for(int x = 0;x<N;x++){
            String inputstr = br.readLine();
            for(int y =0;y<M;y++){
                board[x][y] = inputstr.charAt(y);
            }
        }

        int minchg = 250;
            
            for(int x = 0;x<=N-8;x++){
                for(int y =0;y<=M-8;y++){
                    char[][] subboard = new char[8][8];
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            subboard[i][j] = board[x + i][y + j];
                        }
                    }
                    int chk = wbwchk(subboard);
                    if(minchg > chk){
                        minchg = chk;
                    }
                }
            }
        
            System.out.print(minchg);
        }

    }


        
     
