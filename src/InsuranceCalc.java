import java.util.Scanner;

public class InsuranceCalc {
    public static void main(String[] args){
        String plan, work, carType;
        int age, accidents;
        float discount, surcharge = 0, cost = 0, insuranceCost;
        Scanner scanner = new Scanner(System.in);

        System.out.println("********Calculate Insurance Premium*********\nEnter Insurance Plan (silver, gold, platinum): ");
        plan = scanner.nextLine();
        System.out.println("Enter Your Age: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Where Do You Work At (student, state, federal): ");
        work = scanner.nextLine();
        System.out.println("How Many Accidents Have You Been Involved In: ");
        accidents = Integer.parseInt(scanner.nextLine());

        if(plan.equalsIgnoreCase("silver") || plan.equalsIgnoreCase("gold") || plan.equalsIgnoreCase("platinum")){
        //Base plan premiums
        if(plan.equalsIgnoreCase("silver")){
            cost = 150;
        } else if ((plan.equalsIgnoreCase("gold"))){
            cost = 250;
        }else if ((plan.equalsIgnoreCase("platinum"))){
            cost = 250;
        }

        //Rules for discount
        if(age < 25 && work.equalsIgnoreCase("student") && accidents == 0){
            discount = (float) ((10.0 / 100) * cost);
        } else if (age > 25 && (work.equalsIgnoreCase("state") || work.equalsIgnoreCase("federal")) && accidents == 0 ) {
            discount = (float) ((5.0 / 100) * cost);
        } else {
            discount = 0;
        }

        //Rules for surcharges
        if(accidents > 2){
            if(work.equalsIgnoreCase("students")){
                surcharge = (float) ((15.0 / 100) * cost);
            }else{
                surcharge = (float) ((12.0 / 100) * cost);
            }
        }

        Scanner scn = new Scanner(System.in);
        System.out.println("What Type of Car Do You Have (luxury, standard, EV)");
        carType = scn.nextLine();

        //Rules for discounts/surcharges
        if(carType.equalsIgnoreCase("luxury")){
            surcharge = (float) (surcharge + ((25.0 / 100) * cost));
        } else if (carType.equalsIgnoreCase("ev")) {
            discount = (float) (discount + ((7.0 / 100) * cost));
        }

        insuranceCost = (cost + surcharge) - discount;
            System.out.println("Your Insurance Cost Is: " + insuranceCost);

        }else {
            System.out.println("Invalid Insurance Plan Provided");
        }
    }
}
