
import java.io.BufferedReader;
import java.io.InputStreamReader;




public class Main{

    public static void main(String[] args) throws Exception{
        
        StringBuilder sb = new StringBuilder();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int resultint = Integer.parseInt(a)+Integer.parseInt(b)-Integer.parseInt(c);

        int len = b.length();
        int mul = 1;
        for(int i=0;i<len;i++){
            mul*= 10;
        }
        int resultstr = Integer.parseInt(a)*mul+Integer.parseInt(b)-Integer.parseInt(c);

        sb.append(resultint).append("\n");

        sb.append(resultstr);
        
        System.out.println(sb.toString());



    }
    
}

    





