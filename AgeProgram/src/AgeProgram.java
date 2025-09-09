import java.util.Scanner;

public class AgeProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Ask the user for their age
         */
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();

        /**
         * Store the age in a double variable
         */
        double a = age;

        /**
         * Print both values
         */
        System.out.println("Age(int): " + age);
        System.out.println("Age(double): " + a);

    }
}
