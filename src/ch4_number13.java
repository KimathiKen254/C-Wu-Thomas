
import java.text.DecimalFormat;
import java.util.Scanner;


public class ch4_number13 {
 public static void main (String [] args){   
    
    //input
    seat A,B,C;
    double numberOfA_seats,numberOfB_seats,numberOfC_seats;
    double totalSales;
    Scanner scanner = new Scanner(System.in);
    DecimalFormat DF = new DecimalFormat("0.00");
    
     System.out.println("Number of A seats will be:");
     numberOfA_seats = scanner.nextDouble();
    
     System.out.println("Number of B seats will be:");
     numberOfB_seats = scanner.nextDouble();
    
     System.out.println("Number of C seats will be:");
     numberOfC_seats = scanner.nextDouble();
    
     System.out.println("Price per A seat will be:");
     A = new seat(scanner.nextDouble());
     
     System.out.println("Price per B seat will be:");
     B = new seat(scanner.nextDouble());
     
     System.out.println("Price per C seat will be:");
     C = new seat(scanner.nextDouble());
    
     //Computing the variables
   
     
     totalSales = (numberOfA_seats*A.getPrice()) + (numberOfB_seats*B.getPrice()) + (numberOfC_seats * C.getPrice());   
     
     //Output
     System.out.println("The total sales will be:"+"$"+ DF.format(totalSales) );
}
}

