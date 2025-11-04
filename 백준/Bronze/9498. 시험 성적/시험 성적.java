import java.util.*;
// import java.time.LocalDate;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        char score;

        if (90<= a) {
            score = 'A';
        }
        else if (80 <= a){
            score = 'B';
        }
        else if (70 <= a){
            score = 'C';
        }
        else if (60 <= a){
            score = 'D';
        }
        else {
            score = 'F';
        }
        
        System.out.print(score);
        
    }
}