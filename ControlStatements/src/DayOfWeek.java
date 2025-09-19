import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        /**
         * Create a scanner object to read user input
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");

        /**
         * Read the user's input and store it in the variable number
         */
        int number = sc.nextInt();

        if(number == 1){
            System.out.println("Monday");
        }
        else if(number == 2){
            System.out.println("Tuesday");
        }
        else if(number == 3){
            System.out.println("Wednesday");
        }
        else if(number == 4){
            System.out.println("Thursday");
        }
        else if(number == 5){
            System.out.println("Friday");
        }
        else if(number == 6){
            System.out.println("Saturday");
        }
        else if(number == 7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalid input. Please enter a number between 1 to 7");
        }
    }
}
