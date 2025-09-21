package whileloop;

import java.util.Scanner;

public class MultiplicationTable {
   public static void main(String[] args) {

        // Read input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        int i = 1;

       // Loop to print multiplication table up to 10
        while (i <= 10){
            System.out.println((number * i));
            i++;
        }
    }
}
