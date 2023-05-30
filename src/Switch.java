
import java.util.Scanner;


public class Switch {
    
    /* In this program the score value will be taken from the end-user, 
      as input and the logic to find the grade will be
      written in a separate method .
      I will call this method findGrade()
    */
    
    public static String findGrade(int score){  
        //Check if the score is within 0-100 or not
        
        if (score<0 || score>100)
        return "Invalid score";
        
        //switch-case
        switch(score/10){
       // for>=90
        case 10:
        case 9:
        return "A" + " You will need to score 90-100 to get an A in this class.";
        // for >= 80 and <89
        case 8:
           return "B" + " You will need to score 80-89 to get B in this class.";
        // for >= 70 and <79
        case 7:
           return "C"+ " You will need to score 70-79 to get C in this class.";
        // for >= 65 and <69
        case 6:
           return "D" + " You will need to score 65-69 to get D in this class.";
        // for < 65
        default:
           return "F"+ " Work harder next time!";
      }
   }
        
        public static void main(String[] args) {
      // Create Scanner class object to get input value
      Scanner scan = new Scanner(System.in);
      
      // take input for score
      System.out.print("Enter score value: ");
      int score = scan.nextInt();
      
    //FInd grade and display results
      System.out.println("Grade = "+ findGrade(score));
       
    }
}

