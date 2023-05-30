
import java.text.DecimalFormat;
import java.util.Scanner;

public class ch4_number16 {
    public static void main (String [] args){
        CoffeeBag bag;
        double bagWeight = 0.0,NumberOfBags = 0.0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        bag = new CoffeeBag(bagWeight,NumberOfBags );
        
        System.out.println("Enter the number of coffee bags:");
        NumberOfBags = sc.nextDouble();
        bag.setNumberOfBags(NumberOfBags);
        
        System.out.println("Enter the weight per bag of coffee:");
        bagWeight = sc.nextDouble();
        bag.setBagWeight(bagWeight);
        
        System.out.println("Number of bags sold:"+bag.getNumberOfBags() +"\n"+
                                "Weight per bag:"+bag.getBagWeight()+"\n"+
                              "prices per pound:"+"$5.99"+"\n"+
                                     "Sales tax:"+"7.25%"+"\n"+
                                   "Total Price:"+df.format(bag.getTotalSales())+"\n"+
                          "Total price with Tax:"+df.format(bag.gettotalPriceWithTax()+bag.getTotalSales())
                );  
    } 
}
