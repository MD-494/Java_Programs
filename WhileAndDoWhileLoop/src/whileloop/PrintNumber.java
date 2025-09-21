package whileloop;

import java.util.Scanner;

public class PrintNumber {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int i = sc.nextInt();

        // While loop to print numbers from i to 50
        while (i <= 50) {
            System.out.println(i);
            i++;
        }
    }
}
