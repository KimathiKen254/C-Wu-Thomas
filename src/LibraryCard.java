
import java.util.Calendar;
import java.util.GregorianCalendar;


public class LibraryCard {
    
    //declare the data members
    private Student owner;
    private int borrowCnt;
    private  GregorianCalendar expDate;
    
    public LibraryCard(){
        owner = null;
        borrowCnt = 0;
        expDate = null;
    }
    
    public String getOwnerName(){
        return owner.getName();
    }
    
    public void setOwnerName(Student student){ //the onwer is a student
        owner = student;
    }
    
    public void  setOwner(Student student){
        owner = student;
    }
    
   public void checkOut(int numOfBooks){
       borrowCnt = borrowCnt+numOfBooks;
   } 
   
    public int getNumOfBooks(){
        return borrowCnt;
    }
    
    public void setExpDate(GregorianCalendar date){
        expDate = date;
    }
    
    public int  getExpYear(){
        return expDate.get(Calendar.YEAR);
    }
    
    public int getExpMonth(){
        return expDate.get(Calendar.MONTH);
    }
    
    public int getExpDate(){
        return expDate.get(Calendar.DATE);
    }
     
    public String ken(){
        return "Owner Name:" + owner.getName()+"\n"+
               "      Email:" + owner.getEmail()+"\n"+ 
               "Books borrowed:" + borrowCnt;        
    }
}
