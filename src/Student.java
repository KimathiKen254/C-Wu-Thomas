
public class Student {
    //declare the data members
    private String ownerName;
    private String emailAddress;
    
   //initialize the constructor
    public Student(){
        ownerName = "";
        emailAddress = "";
    }
    
    public void setName(String name){
        ownerName = name;
    }
    
    public String getName(){
        return ownerName;
    }
    
    public void setEmail(String email){
        emailAddress = email;
    }
    
public String  getEmail(){
    return emailAddress;
    }
}
