
import java.util.Calendar;
import java.util.GregorianCalendar;


public class LIbrarian {
 public static void main(String[] args){
        GregorianCalendar expDate = new GregorianCalendar(2023, Calendar.MARCH, 23);
        Student student;
        LibraryCard card1, card2;
        
        student = new Student();
        student.setName("Jon Java");
        student.setEmail("baxfordjim@gmail.com");
        
        card1 = new LibraryCard();
        card1.setOwner(student);
        card1.setExpDate(expDate);
        card1.checkOut(3);
        
        card2 =new LibraryCard();
        card2.setOwner(student);
        
        System.out.println("card1 Info: ");
        System.out.println(card1.ken() + "\nCard Expiry Year: " + card1.getExpYear() + "\n");
        
        System.out.println("Card2 Info: ");
        System.out.println(card2.ken() + "\n");
    }
}

