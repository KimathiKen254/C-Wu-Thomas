
import java.util.Random;


public class die {
    
    /*We want to write a program whereby we have one die
    and we roll it theree time
    for each roll we wiil record the number of times it rolls
    we will then record the sum total of rolls the die has rolled 
    for the three counts.
    */
    private static final int MAX_NUMBER = 6;
    private static final int MIN_NUMBER = 1;
    private static final int NO_NUMBER = 0;
    private int number;
    private Random random;
    
    public die(){
        random =new Random();
        number = NO_NUMBER;
    }
    public void roll(){
        number = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) +MIN_NUMBER;
    }
    public int getNumber(){
        return number;
    }
}
    
    
    
    
    
    
    
    
    
    

