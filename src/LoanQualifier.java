
import java.text.DecimalFormat;
import java.util.Scanner;


public class LoanQualifier {
    
 public static void main (String[]args){ 
    
     //Declaring the variables
     double salary;
     double $numberOfYearsWorked;
     
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
    
    //Input values to be converted
     System.out.println("Enter your salary:");
    salary = scanner.nextDouble();
    
     System.out.println("Enter the number of years worked:");
    $numberOfYearsWorked = scanner.nextDouble();
    
    if (salary<=30000 && $numberOfYearsWorked<=3 && $numberOfYearsWorked>=1){
        System.out.println("The offered interest will be 4.49%.You qualify for the loan");
    }
    
   if ( salary>=31000 && salary<=50000 && $numberOfYearsWorked>=5){
       System.out.println("The offered interest will be 3.75%.You qualify for the loan");
   }
    
   if (salary>=51000 && salary<=90000 && $numberOfYearsWorked>=1 && $numberOfYearsWorked<=7){
       System.out.println("THe offered interest will be 1.99%.You qualify for the loan");
   }
   
   else {
       
       System.out.println("You are not qualified for the loan");
   } 
}
}
