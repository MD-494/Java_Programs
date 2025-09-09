import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Take input from user
         */
        System.out.println("Enter the First value: ");
        int v1 = sc.nextInt();

        System.out.println("Enter the Second value: ");
        int v2 = sc.nextInt();

        /**
         * Performing arithmetic operations and relational operations
         */
        System.out.println("Choose an operation: ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("6.Greater than");
        System.out.println("7.Less than");
        System.out.println("8.Equal to");
        System.out.println("9.Not Equal to");
        System.out.println("10.Greater than or Equal to");
        System.out.println("11.Less than or Equal to");

        /**
         * take input from user to perform the operations
         */
        System.out.println("Enter Your choice(1 to 11): ");
        int ch = sc.nextInt();

        /**
         * Perform the chosen operations
         */
        if(ch == 1) {
            System.out.println("Addition is: " + (v1 + v2));
        }
        if(ch == 2) {
            System.out.println("Subtraction is: " + (v1 - v2));
        }
        if(ch == 3) {
            System.out.println("Multiplication is: " + (v1 * v2));
        }
        if(ch == 4) {
            System.out.println("Division is: " + (v1 / v2));
        }
        if(ch == 5) {
            System.out.println("Modulus is: " + (v1 % v2));
        }
        if(ch == 6) {
            System.out.println(v1 + " > " + v2 + (v1 > v2));
        }
        if(ch == 7) {
            System.out.println(v1 + " < " + v2 + (v1 < v2));
        }
        if(ch == 8) {
            System.out.println(v1 + " == " + v2 + (v1 == v2));
        }
        if(ch == 9) {
            System.out.println(v1 + " != " + v2 + (v1 != v2));
        }
        if(ch == 10) {
            System.out.println(v1 + " >= " + v2 + (v1 >= v2));
        }
        if(ch == 11) {
            System.out.println(v1 + " <= " + v2 + (v1 <= v2));
        }
    }
}
