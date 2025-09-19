import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {

        /**
         * Create a scanner object to read user input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");

        /**
         * Read the user's input and store it in the variable year
         */
        int year = sc.nextInt();

        if(year % 4 == 0){
            // If the year is leap year, print "Given year is leap year"
            System.out.println("Given year is leap year");
        }
        else{
            // If the year is not leap year, print "Given year is not leap year"
            System.out.println("Given year is not leap year");
        }
    }
}
