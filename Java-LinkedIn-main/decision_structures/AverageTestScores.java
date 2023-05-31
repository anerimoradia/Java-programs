package decision_structures;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        int numberOfStudents = 4;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //process all student
        for(int x = 0; x < numberOfStudents; x++){

            double total = 0;

            //process a student's test scores
            for(int y = 0; y < numberOfTests; y++){
                System.out.println("Enter the score for Test #" + (y+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTests;
            System.out.println("The test average for student#" + (x+1) + " is " + average );
        }

        scanner.close();
    }
}
