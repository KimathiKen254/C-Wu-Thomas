
import java.util.Scanner;


public class ch4_number7 {
    
    public static void main(String[] arg ){
     Temperature tmp = new Temperature();
        
        double degreeFahrenheit;
        
        //Input
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter temperature  in degree fahrenheit:");
        degreeFahrenheit = sc.nextDouble();
        
        tmp.setFahrenheit(degreeFahrenheit);
        
        System.out.println("degreeFahrenheit:"+tmp.temperature);//why this line of code????
        
        System.out.println("Temperature in degree celcius:"+tmp.toCelcius());
        
    }
}
