import java.util.*;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    static int white;
    static int blue;
    public static void cutting(int[][] papaer){
        int n = papaer[0].length;
        int halfn= n/2;
        int[][] half_papaer;

        for(int j=0;j<4;j++){
            half_papaer = new int[halfn][halfn];
            int rowoffset = (j/2)*halfn;
            int coloffset = (j%2)*halfn;
            
            for(int i=0;i<halfn;i++){
                half_papaer[i] = Arrays.copyOfRange(papaer[i+rowoffset], coloffset, coloffset+halfn);
            }
            cheking(half_papaer);
        }

    }
    public static void cheking(int[][] papaer){
        int n = papaer[0].length;
        int bse_clr = papaer[0][0];
        boolean matched = true;

        //색확인
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(papaer[i][j]!=bse_clr){
                    matched = false;
                    break;
                }
            }
            if(!matched){break;}
        }
        //색 모두 일치
        if(matched){
            if(bse_clr==1){
                blue ++;
            }
            else{
                white ++;
            }
        }
        //색 불일치 -> 재커팅 후 재귀
        else{
            cutting(papaer);
        }

    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int N = Integer.parseInt(br.readLine());
        
        int[][] papaer = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0;j<N;j++){
                papaer[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        white = 0; blue =0;
        cheking(papaer);

        sb.append(white).append("\n").append(blue);


        System.out.println(sb.toString());
        
    }

    
    }
