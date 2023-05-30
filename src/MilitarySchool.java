import java.util.Scanner;

public class MilitarySchool {
    public static void main(String[] args){
        String name, gender, usCitizen;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******Military School Eligibility Check*******");
        System.out.println("Enter Your Full Name: ");
        name = scanner.nextLine();
        System.out.println("Gender: ");
        gender = scanner.nextLine();
        gender = gender.toLowerCase();
        System.out.println("Age: ");
        age = scanner.nextInt();

        boolean checkAge;
        if(gender.equals("male") && age>=18 && age<=30) {
            checkAge = true;
        }else if(gender.equals("female") && age>=18 && age<=34){
            checkAge = true;
        }else{
            checkAge = false;
        }

        if(checkAge){
            System.out.print("Are you a US citizen? (yes/no)");
            Scanner scn = new Scanner(System.in);
            usCitizen = scn.nextLine();
            usCitizen = usCitizen.toLowerCase();
            if(usCitizen.equals("yes")){
                System.out.println(name + " you are eligible to enroll in military school");
            }else{
                System.out.println(name + " you are ineligible to apply due to non-US citizen");
            }
        }else{
            System.out.print(name + " you are currently ineligible to enroll in military school");
        }
    }
}
