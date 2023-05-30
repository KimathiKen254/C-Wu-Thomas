
public class Bicycle {
/*Instead of creating a separate main class ,
    we can define the main method 
    to the Bicycle class
    */    

    
//Data Member    
    private String ownerName;
    
    //Returns the name of this Bicycle's owner 
    public String getOwnerName(){
        return ownerName;
    }
    
    
    //Assigns the name to this BIcycle's owner
    public void setOwnerName(String name){
        ownerName = name;
    }
    
    //The main method that shows a sample
    //Use of the Bicycle class
    public static void main (String [] args){
    String nem = "Jon Java";
        Bicycle myBike;
        myBike = new Bicycle();
        myBike.setOwnerName(nem);
        System.out.println(myBike.getOwnerName()+" "+"owns a bicycle.");
        
    }
}
