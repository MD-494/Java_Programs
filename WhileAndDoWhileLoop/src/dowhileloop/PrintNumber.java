package dowhileloop;

import java.util.Scanner;

public class PrintNumber {

    static void main(String[] args) {

        // Read input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");

        int num = sc.nextInt();

        // Do-while loop to print numbers from 'num' to 10
        do {
            System.out.println(num);
            num++;

        } while (num <= 10);
    }
}
