import java.util.Scanner;

public class DecimalToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Take input from user
         */
        System.out.println("Enter Decimal number: ");
        double d = sc.nextDouble();

        /**
         * cast the decimal number into integer
         */
        int i = (int) d;

        /**
         * Print both the original decimal and the integer result
         */
        System.out.println("Original decimal: " + d);
        System.out.println("Integer Result: " + i);
    }
}
