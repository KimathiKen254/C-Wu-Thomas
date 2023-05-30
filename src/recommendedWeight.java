
import java.text.DecimalFormat;
import java.util.Scanner;


public class recommendedWeight {
 
    public static void main (String [] args){
        Height h;
        double recommendedWeight;
        
        //Input 
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        h= new Height();
        
        System.out.println("Enter the age:");
         h.setAge(scanner.nextInt());
        
        System.out.println("Enter the height:");
        h.setHeight(scanner.nextInt());
        
        //Computation
        h.computeWeight(h.getAge(),h.getHeight());
        recommendedWeight = h.getWeight();
        
       //Output
        System.out.println("The recommended weight will be:"+df.format(recommendedWeight) +"kgs");
        
    }
}
