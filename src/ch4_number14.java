
import java.text.DecimalFormat;
import java.util.Scanner;


public class ch4_number14 {
    
    public static void  main (String [] args){
    //Weight(F) = mass * gravity;
    
    //declare the variables
    double Weight;  //this is the input
    Scanner k = new Scanner(System.in);
    DecimalFormat m = new DecimalFormat("0.00");
    weightconverter moonWeight,mercuryWeight,venusWeight,jupiterWeight,saturnWeight;
    
    moonWeight = new  weightconverter(0.67);
    mercuryWeight = new weightconverter(0.4);
    venusWeight = new weightconverter(0.9);
    jupiterWeight = new weightconverter(2.5);
    saturnWeight = new weightconverter(1.1);
    
        System.out.println("Enter your weight on planet earth:");
        Weight = k.nextDouble();
    
    //Weight on the various platforms will be
        System.out.println("You will weight:"+m.format(moonWeight.convert(Weight)+"kgs."+"\n"));
        System.out.println("You will weight:"+m.format(mercuryWeight.convert(Weight)+"kgs."+"\n"));
        System.out.println("You will weight:"+m.format(venusWeight.convert(Weight)+"kgs."+"\n"));
        System.out.println("You will weight:"+m.format(jupiterWeight.convert(Weight)+"kgs."+"\n"));
        System.out.println("You will weight:"+m.format(saturnWeight.convert(Weight)+"kgs."+"\n"));
}
}
