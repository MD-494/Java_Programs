import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Take input from user
         */
        System.out.println(" Enter the First value: ");
        int v1 = sc.nextInt();

        System.out.println(" Enter the Second value: ");
        int v2 = sc.nextInt();

        /**
         * Performing arithmetic operations and printing its results
         */
        System.out.println("Addition: " + (v1 + v2));
        System.out.println("Addition: " + (v1 - v2));
        System.out.println("Addition: " + (v1 * v2));
        System.out.println("Addition: " + (v1 / v2));
        System.out.println("Addition: " + (v1 % v2));

        /**
         * Performing relational operations and printing its results
         */
        if(v1 > v2) {
            System.out.println("V1 is Greater than V2");
        }
        if(v1 < v2) {
            System.out.println("V1 is Less than V2");
        }
        if(v1 == v2) {
            System.out.println("V1 is Equal to V2");
        }
        if(v1 >= v2) {
            System.out.println("V1 is Greater than or Equal to V2");
        }
        if(v1 <= v2) {
            System.out.println("V1 is less than or Equal to V2");
        }
        if(v1 != v2) {
            System.out.println("V1 is Not Equal to V2");
        }
    }
}
