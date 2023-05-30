
import java.text.DecimalFormat;
import java.util.Scanner;
    
public class chapter3exercises_number7 {
    
    public static void main (String [] args){
    DecimalFormat df =new DecimalFormat("0.00");
    Scanner sc = new Scanner(System.in);
    double  cm,in,foot;
   
       //input
        System.out.println("Enter your input length in centimeters (cm) ");
        cm = sc.nextDouble();
         
        //computing variables 
          in = (cm/2.54);
          foot = (cm/2.54)/12;
        
        System.out.println("unit of distance in feet:" + df.format(foot) + " feet" + "\n");
        System.out.println("unit of distance in inches:" + df.format(in) +" inches");
    
    
    }
    
}

    
    
    
    
    
    
    
    
    
    

