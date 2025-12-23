import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        double xabs = Math.sqrt(Math.pow(D, 2)/(Math.pow(H,2)+Math.pow(W,2)));
        int rH = (int)Math.floor(xabs*H);
        int rW = (int)Math.floor(xabs*W);


        sb.append(rH).append(" ").append(rW);

        System.out.println(sb.toString());
       
        
    }

    
    }
