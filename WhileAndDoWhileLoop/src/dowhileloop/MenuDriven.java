package dowhileloop;

import java.util.Scanner;

public class MenuDriven {

    static void main(String[] args) {

        // Read input from the user
        Scanner sc = new Scanner(System.in);
        int choice; // Variable to store user's menu choice

        /**
         *  Start a do-while loop to repeatedly show the menu until user chooses to exit
         */
        do {
            // Display menu options
            System.out.println("1. Greet\n2. Get Name\n3. Get class\n4. Exit");
            System.out.print("Enter your choice :");

            // Read user's choice (integer input)
            choice = sc.nextInt();

            // Execute different actions based on user's choice
            if (choice == 1) {
                System.out.println("Hello...");
            } else if (choice == 2) {
                System.out.println("Mansi");
            } else if (choice == 3) {
                System.out.println("BE");
            }

            // The loop will continue until choice is 4 (Exit)
        } while (choice != 4);
    }
}
