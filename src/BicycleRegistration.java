
public class BicycleRegistration {
    
    
    public static void main(String[]args){
    String owner1,owner2;
       
   Bicycle1 bike1, bike2;
        
        bike1 = new Bicycle1();
        bike1.setOwnerName("Kanairo");
        
        bike2 = new Bicycle1();
        bike2.setOwnerName("Munairo");
        
        //output       
        owner1 = bike1.getOwnerName();
        owner2 =  bike2.getOwnerName();
        
        
        System.out.println(owner1+" owns a bicycle");
        System.out.println(owner2+" also owns a bicycle");
        
    }
 
}
