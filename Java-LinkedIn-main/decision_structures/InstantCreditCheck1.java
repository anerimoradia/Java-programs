package decision_structures;

import java.util.Scanner;

import static decision_structures.InstantCreditCheck.isUserQualified;

public class InstantCreditCheck1 {

    public static void main(String[] args) {

        //Get Input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        //Check if the user is qualified

        boolean qualified = isUserQualified(actualCreditScore, actualSalary);
        notifyUser(qualified);
        //isUserQualified(actualCreditScore, actualSalary);
    }

    public static boolean isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            //System.out.println("Congrats! You've been approved!");
            return true;
        }
        else{
            //System.out.println("Sorry, you've been declined.");
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry. You've been declined");
        }
    }
}
