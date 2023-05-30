
import java.util.Scanner;
public class nestedIf {
    
public static void main (String [] args){
    
    Scanner scanner = new Scanner (System.in);
    double testScore,studentAge;
     
    System.out.println("Enter the test score:");
    testScore = scanner.nextDouble();
    
    System.out.println("Enter the student's age:");
    studentAge = scanner.nextDouble();
    
if (testScore >= 70) {
if (studentAge < 10) {
System.out.println("You did a great job");
}
else {
System.out.println("You did pass");//test score >= 70
}
//and age >= 10
}
else { //test score < 70
System.out.println("You did not pass");
}

}
}
