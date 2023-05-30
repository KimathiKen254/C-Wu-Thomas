
import java.util.Scanner;


public class nestedifver2 {
    
public static void main (String [] args){
    
    Scanner scanner = new Scanner (System.in);
    double testScore,studentAge;
     
    System.out.println("Enter the test score:");
    testScore = scanner.nextDouble();
    
    System.out.println("Enter the student's age:");
    studentAge = scanner.nextDouble();

if (testScore >= 70 && studentAge < 10) {
System.out.println("You did a great job");
} else {
//either testScore < 70 OR studentAge >= 10
if (testScore >= 70) {
System.out.println("You did pass");
} else {
System.out.println("You did not pass");
}
}

}}