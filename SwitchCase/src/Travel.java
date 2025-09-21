import static java.lang.IO.readln;

public class Travel {
    public static void main(String[] args) {
        /**
         * Give input from users
         */
        String city = readln("Enter the city name you want to visit (Mumbai, Delhi, Paris, New York): ");

        /**
         * Switch statement to perform different actions
         */
        switch (city){
            // If user enters "Mumbai", print a travel suggestion for Mumbai
            case "Mumbai":
                IO.println("Explore the Gateway of India in Mumbai");
                break;

            // If user enters "Delhi", print a travel suggestion for Delhi
            case "Delhi":
                IO.println("Visit the Red Fort in Delhi");
                break;

            // If user enters "Paris", print a travel suggestion for Paris
            case "Paris":
                IO.println("Visit Eiffel Tower in Paris");
                break;

            // If user enters "New York", print a travel suggestion for New York
            case "New York":
                IO.println("Visit Central Park in New York");
                break;

            // If city name doesn't match any of the cases it prints below statement
            default:
                IO.println("Sorry, we don't have any information about this city");
        }
    }
}
