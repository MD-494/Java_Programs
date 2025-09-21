import static java.lang.IO.readln;

public class DaysOfWeek {
    public static void main(String[] args) {

        /**
         * Give input from user
         */
        int day = Integer.parseInt(IO.readln("Enter Number: "));

        /**
         * // Use a switch statement to determine the day of the week based on the input number
         */
        switch (day){
            case 1:
                IO.println("Monday");  // If user enters 1
                break;

            case 2:
                IO.println("Tuesday");  // Of user enters 2
                break;

            case 3:
                IO.println("Wednesday");  // If user enters 3
                break;

            case 4:
                IO.println("Thursday");   // If user enters 4
                break;

            case 5:
                IO.println("Friday");  // If user enters 5
                break;

            case 6:
                IO.println("Saturday");  // If user enters 6
                break;

            case 7:
                IO.println("Sunday");  // If user enters 7
                break;

            // If input is not between 1 and 7
            default:
                IO.println("Invalid choice");
        }
    }
    }
