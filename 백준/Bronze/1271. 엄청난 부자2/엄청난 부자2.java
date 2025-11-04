import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BigInteger n = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());
    
        BigInteger qu = n.divide(m);
        BigInteger re = n.remainder(m);
        
        System.out.println(qu);
        System.out.println(re);
        
    }
}