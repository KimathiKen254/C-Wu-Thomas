
import java.text.DecimalFormat;
import java.util.Scanner;


public class Quotient_Reminder {
    public static void main (String [] args){
    double dividend,divisor,quotient,reminder;
    Scanner scanner = new Scanner (System.in);    
    DecimalFormat df = new DecimalFormat("0.0");    
        
        //Input
        System.out.println("Enter the dividend:");
        dividend = scanner.nextDouble();
        
        System.out.println("Enter the divisor:");
        divisor = scanner.nextDouble();
        
        System.out.println("Enter the quotient:");
        quotient = scanner.nextDouble();
        
        //Computing quotient and the reminder
        quotient = dividend/divisor;
        
        reminder = dividend- (divisor*quotient);
        
        //Display
        System.out.println("The quotient is:" + df.format(quotient) + "\n");
        System.out.println("The reminder is:"+ df.format(reminder));
        
    }
}
