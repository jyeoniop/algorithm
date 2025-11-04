import java.util.*;
// import java.time.LocalDate;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        long result = N-M;

        if (result <0){
            result *= -1;
        }
        
        System.out.print(result);
        
    }
}