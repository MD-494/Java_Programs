import java.util.Scanner;

public class CheckPositiveNo {
    public static void main(String[] args) {

        /**
         * Create a scanner object to read user input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        /**
         * Read the user's input and store it in the variable a
         */
        int a = sc.nextInt();

        /**
         * if statement to check if "a" is greater than 0
          */
        if(a > 0){
            // If the condition is true, print "Number is positive"
            System.out.println("Number is positive");
        }
    }
}
