
import java.util.Scanner;


public class ch4_number8 {
    
public static void main(String[] arg ){
     Temperature tmp = new Temperature();
        
        double degreeCelcius;
        
        //Input
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter temperature  in degree fahrenheit:");
        degreeCelcius = sc.nextDouble();
        
        tmp.setFahrenheit(degreeCelcius);
        
        System.out.println("degreeFahrenheit:"+tmp.temperature);//why this line of code????
        
        System.out.println("Temperature in degree fahrenheit:"+tmp.toFahrenheit());
        
    }
}

