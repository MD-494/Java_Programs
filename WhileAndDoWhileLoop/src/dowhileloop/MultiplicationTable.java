package dowhileloop;

import java.util.Scanner;

public class MultiplicationTable {

    static void main(String[] args) {

        // Read input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        // Initialize counter variable for the loop
        int i = 1;

        // Use do-while loop to print multiplication table
        do {
            System.out.println(num * i);
            i++;

        } while (i <= 10);
    }
}
