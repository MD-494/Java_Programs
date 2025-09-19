import java.util.Scanner;

public class SalaryClassification {
    public static void main(String[] args) {

        /**
         * Create a scanner object to read user input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");

        /**
         * Read the user's input and store it in the variable salary
         */
        int salary = sc.nextInt();

        if(salary<=1500) {
            // If salary is less than or equal to 1500, print "Peon"
            System.out.println("Peon");
        }
        else if((salary>=1501) && (salary<=25000)) {
            //If salary is between 1501-25000, print "2nd division clerk"
            System.out.println("2nd division clerk");
        }
        else if((salary>=25001) && (salary<=35000)) {
            //If salary is between 25001-35000, print "1st division clerk"
            System.out.println("1st division clerk");
        }
        else if((salary>=35001) && (salary<=45000)) {
            //If salary is between 35001-45000, print "Assistant Manager"
            System.out.println("Assistant Manager");
        }
        else {
            //if salary is above 45000, print "Manager"
            System.out.println("Manager");
        }
    }
}
