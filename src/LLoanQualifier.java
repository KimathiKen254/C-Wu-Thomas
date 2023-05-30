import java.util.Scanner;

public class LLoanQualifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int salary, years;
        System.out.println("*******Loan Qualifier*******\nInput salary: ");
        salary = scanner.nextInt();
        System.out.println("Years worked: ");
        years = scanner.nextInt();

        if(salary < 30000 && years >= 1 && years <= 3){
            System.out.print("Offered interest will be at 4.49%");
        } else if (salary > 31000 && salary < 50000 && years >= 1 && years <= 5) {
            System.out.print("Offered interest will be at 3.75%");
        }else if (salary > 91000 && years >= 1 && years <= 7) {
            System.out.print("Offered interest will be at 1.99%");
        }else {
            System.out.print("You are not qualified for the loan");
        }
    }
}
