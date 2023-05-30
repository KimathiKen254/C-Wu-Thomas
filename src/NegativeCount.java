
public class NegativeCount {

    public static void main(String[] args){
        int a = -2, b = -6, c = -5;

        int negativeCount = 0;

        if(a < 0)
            negativeCount = negativeCount +1;
        if(b < 0)
            negativeCount = negativeCount +1;
        if(c < 0)
            negativeCount = negativeCount +1;

        System.out.println("Negative Count: " + negativeCount);
    }


}    

