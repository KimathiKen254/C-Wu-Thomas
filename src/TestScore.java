
import java.util.Scanner;


public class TestScore {
 
   public static void main (String [] args){ 
    Scanner scanner = new Scanner(System.in);
       System.out.println("Enter test score:");
    int testscore = scanner.nextInt();
    
    if(testscore>70){
        System.out.println("YOu did pass");
    }
    
    else
           System.out.println("You did not pass");
    
   }
}
