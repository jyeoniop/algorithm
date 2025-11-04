import java.util.*;
import java.io.*;
// import java.time.LocalDate;

public class Main{
    public static void main(String args[]) throws Exception{
        // Scanner sc = new Scanner(System.in);
        
        // int N = sc.nextInt();

        // while(sc.hasNextInt()){
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     System.out.println(a+b);

        // }
        

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int test = 0;test<T;test++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A+B+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
       
    }
}