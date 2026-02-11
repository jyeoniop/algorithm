
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static long pow(long a, long b, long c){
        if(b==1)return a%c;

        long temp = pow(a, b/2,c);

        if(b%2==1){
            return (temp*temp%c)*(a%c) %c;
        }
        return temp*temp%c;
    }
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        double result = pow((long)a, (long)b, (long)c);
        

        System.out.println((int)result);
        

    }

}
