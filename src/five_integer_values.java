
import java.text.DecimalFormat;
import java.util.Scanner;


    public class five_integer_values {
    
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
        double first_integer_number;
        double second_integer_number;
        double third_integer_number;
        double fourth_integer_number;
        double fifth_integer_number;
        double sum;
        double sqrt;
        
        System.out.println("Enter the first integer number:");
        first_integer_number = scanner.nextDouble();
        
        System.out.println("Enter the second integer number:");
        second_integer_number = scanner.nextDouble();
        
        System.out.println("Enter the third integer number:");
        third_integer_number = scanner.nextDouble();
        
        System.out.println("Enter the fourth integer number:");
        fourth_integer_number = scanner.nextDouble();
        
        System.out.println("Enter the fifth integer number:");
        fifth_integer_number = scanner.nextDouble();
        
  //Adding the five integers numbers and storing the result in the variable sum
  sum = (first_integer_number+second_integer_number+third_integer_number+fourth_integer_number+fifth_integer_number);
        
  //Finding the square root of sum      
       sqrt = Math.sqrt(sum);
        
     System.out.println("The total of the five variables is:" + df.format(sum)+"\n"); 
     System.out.println("The square root of the total is:" + df.format(sqrt));
          
    }
}
