package forloop;

import java.util.Scanner;

public class PrintNumber {
    static void main(String[] args) {

        // Accept input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();

        // 'for' loop to print numbers from 1 to n
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
