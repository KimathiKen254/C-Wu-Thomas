import java.text.DecimalFormat;
import java.util.Scanner;
    
public class chapter3exercises_number25 {
    
public static void main(String[]args){
DecimalFormat df = new DecimalFormat("0.000");    
Scanner sc = new Scanner(System.in);
double yearA, yearB,yearC,X,x;
double K,population_of_yearA,population_of_yearB,population_of_yearC;

System.out.println("year A:");
yearA = sc.nextInt();

System.out.println("population of year A:");
population_of_yearA = sc.nextInt();

System.out.println("year B:");
yearB = sc.nextInt();

System.out.println("population of year B:");
population_of_yearB = sc.nextInt();

    System.out.println("yearC:");
    yearC = sc.nextInt() ;
                 
       //Computing Variables
       X = (yearB - yearA);
       double k =(( Math.pow(X, -1)) * Math.log(population_of_yearB/population_of_yearA) ) ;
       x = (yearC - yearA);
       double Result = (k*x);      
    
        //Population for yearC will be calculated as follows
        population_of_yearC = ((population_of_yearA) * (Math.pow(Math.E,Result)));
        
        System.out.println("COnstant k:" + k+"\n");
        System.out.println("Result is:" + Result+"\n");
        
        System.out.println("Population of year C:" + df.format(population_of_yearC));
        
    } 
}





    
    
    
    
    
    
    
    
    
    
    
    
    

