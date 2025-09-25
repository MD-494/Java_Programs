import java.util.Scanner;

/**
 * Check whether a number is even or odd using ternary operator
 */
public class EvenOddNumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IO.println("Enter the Number: ");

        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "even": "odd";

        IO.println("Given Number is: " + result);
    }
}
