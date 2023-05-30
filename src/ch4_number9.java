
import java.text.DecimalFormat;
import java.util.Scanner;


public class ch4_number9 {
    
public static void main(String [] args){
 
    //input
    double radius1,radius2;
    double AreaOfSmallCircle,AreaOfLargeCircle;
    double CircumferenceOfSmallCircle,CircumferenceOfLargeCircle;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    
    System.out.println("Enter radius of the smalller circle:");
    radius1 = sc.nextDouble();
    
    System.out.println("Enter radius of the bigger circle:");
    radius2 = sc.nextDouble();
    
    Circle circle1,circle2; 
    circle1 = new Circle(radius1);
    circle2 = new Circle(radius2);
    
    //Computation
    AreaOfSmallCircle = circle1.area();
    AreaOfLargeCircle = circle2.area();
    CircumferenceOfSmallCircle = circle1.circumference();
    CircumferenceOfLargeCircle = circle2.circumference();
    
    //Output
    System.out.println("Area of the shaded region will be:"+df.format((AreaOfLargeCircle-AreaOfSmallCircle)));
    System.out.println("Circumference of the inner circle will be:"+df.format(CircumferenceOfSmallCircle));
    System.out.println("CIrcumference of the outer circle will be:"+df.format(CircumferenceOfLargeCircle));
    
}    
}
