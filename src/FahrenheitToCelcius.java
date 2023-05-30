import java.text.DecimalFormat;
import java.util.Scanner;
public class FahrenheitToCelcius {
    
 public static void main (String []args){   
    
    double degrees_Celsius,degrees_fahrenheit;
    Scanner ken = new Scanner (System.in);
    DecimalFormat kennar = new DecimalFormat("0.00");
    
    //input
    System.out.println("Enter temperature in degress celsius:");
    degrees_Celsius = ken.nextDouble();
    
    //computing variable
    degrees_fahrenheit = (1.8 *degrees_Celsius + 32);
    
    //output
     System.out.println("Temperaature in degrees fahrenheit:" + kennar.format(degrees_fahrenheit )+ " degrees fahrenheit");
}
}
