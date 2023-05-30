
public class ch4_number5 {
 
    public static void main (String []  args){
    
   int roll1,roll2,roll3;
    die Die = new die();   //create an object for the die class
        
        //to make the first roll
        Die.roll();
        roll1 = Die.getNumber();
        
        
        //Second roll
        Die.roll();
        roll2= Die.getNumber();
        
        //Third roll
       Die.roll();
       roll3 = Die.getNumber();
       
        System.out.println("The total number of rolls will be:" + roll1+roll2+roll3);
}
}