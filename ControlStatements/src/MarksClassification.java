import java.util.Scanner;

public class MarksClassification {
    public static void main(String[] args) {

        /**
         * Create a scanner object to read user input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");

        /**
         * Read the user's input and store it in the variable marks
         */
        double marks = sc.nextDouble();

        if((marks >= 0) && (marks <= 35)){
            // If marks is between 0-35, print "Fail"
            System.out.println("Fail");
        }
        else if((marks >= 36) && (marks <= 50)){
            // If marks is between 36-50, print "C Grade"
            System.out.println("C Grade");
        }
        else if((marks >= 51) && (marks <= 60)) {
            // If marks is between 51-60, print "B Grade"
            System.out.println("B Grade");
        }
        else if((marks >= 61) && (marks <= 70)) {
            // If marks is between 61-70, print "B+ Grade"
            System.out.println("B+ Grade");
        }
        else if((marks >= 71) && (marks <= 80)) {
            // If marks is between 71-80, print "A Grade"
            System.out.println("A Grade");
        }
        else if((marks >= 81) && (marks <= 90)) {
            // If marks is between 81-90, print "A+ Grade"
            System.out.println("A+ Grade");
        }
        else{
            //if marks is above 90, print "Distinction"
            System.out.println("Distinction");
        }
    }
}
