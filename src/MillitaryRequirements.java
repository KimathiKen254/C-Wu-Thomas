
import java.text.DecimalFormat;
import java.util.Scanner;
        
public class MillitaryRequirements {
        
 public static void main (String[]args){ 
    //Declaring the variables
    String FullName;
    String gender;
    int age;
    String citizen;
    
    Scanner scanner = new Scanner (System.in);
    scanner.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.00");
    
     System.out.println("Enter your full name:");
     FullName = scanner.nextLine();
     
      System.out.println("Enter your age:");
     age = scanner.nextInt();
     
     
     System.out.println("What is your gender, male of female?:");
     gender = scanner.nextLine();
     
    if (gender == "F" && age>=18  && age<=34){
	System.out.println("Are you an USA citizen?"); 
		}
    
    if(gender == "M" && age>=18 && age<=30){
        System.out.println("Are you an USA citizen?");
    }
    
    else{
        System.out.println("You are not elligible");			
		}
}
}
