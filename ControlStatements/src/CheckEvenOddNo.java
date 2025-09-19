import java.util.Scanner;

public class CheckEvenOddNo {
    public static void main(String[] args) {

        /**
         * Create a scanner object to read user input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");

        /**
         * Read the user's input and store it in the variable num
         */
        int num = sc.nextInt();

        if(num % 2 == 0){
            // If the number is even, print "Given number is even"
            System.out.println("Given number is even");
        }
        else {
            // If the number is odd, print "Given number is odd"
            System.out.println("Given number is odd");
        }
    }
}
