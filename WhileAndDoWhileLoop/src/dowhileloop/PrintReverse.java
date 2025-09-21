package dowhileloop;

import java.util.Scanner;

public class PrintReverse {

    static void main(String[] args) {

        // Read input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        int i = sc.nextInt();

        // Do-while loop to print numbers from i down to 0
        do {
            System.out.println(i);  // Print current value of i
            i--; // Decrement i by 1

        }while (i >= 0); // Continue loop while i is greater than or equal to 0
    }
}
