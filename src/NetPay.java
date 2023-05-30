
import java.text.DecimalFormat;
import java.util.Scanner;


   public class NetPay {
       
    public static void main (String [] args){
                          
    //Declaring variable
    String name = "";
    double bi_weekly_hours;
    double hours_pay_rate;
    double state_Tax_Rate;
    double professional_Tax;
    double provident_fund;
    double biweekly_gross_pay;
    double state_tax_deduction;
    double professional_tax_deduction;
    double provident_fund_deduction;
    double netpay;
    
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(System.getProperty("line.separator"));
    DecimalFormat df = new DecimalFormat("0.0");
    
        System.out.println("What is your name?");
        name = sc.next();
     
        System.out.println("What is your biweekly hours");
        bi_weekly_hours = sc.nextDouble();
    
        System.out.println("What is hours pay rate?");
        hours_pay_rate = sc.nextDouble();
    
        System.out.println("What is your state tax rate(in %)");
        state_Tax_Rate = sc.nextDouble();
        
        System.out.println("What is your professional tax(in%)?");
        professional_Tax = sc.nextDouble();
        
        System.out.println("What is your provident fund(in %)?");
        provident_fund = sc.nextDouble();
        
        //Computing Variables
        biweekly_gross_pay = bi_weekly_hours*hours_pay_rate;
        state_tax_deduction = state_Tax_Rate*biweekly_gross_pay*0.01;
        professional_tax_deduction=  professional_Tax*biweekly_gross_pay*0.01;
        provident_fund_deduction = provident_fund*biweekly_gross_pay*0.01;
        netpay =  biweekly_gross_pay- (state_tax_deduction+professional_tax_deduction+ provident_fund_deduction );
        System.out.println("\n");
        System.out.println("***Welcome to the Net Pay Calculator***" + "\n");
        
        System.out.println("Hello" + "\t"+ name + "\n");
        System.out.println("Your biweekly gross pay is:"+"$:"+ biweekly_gross_pay+"\n");
        System.out.println("state tax deduction is"+"$:"+state_tax_deduction+"\n");
        System.out.println("Your professional tax deduction is"+"$:"+professional_tax_deduction+"\n");
        System.out.println("Your provident tax deduction is:"+"$:"+provident_fund_deduction+"\n");
        
    }
}
