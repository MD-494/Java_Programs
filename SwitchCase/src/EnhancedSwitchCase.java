public class EnhancedSwitchCase {
    static void main(String[] args) {
        /**
         * Define a fruit name as a string
         */
        String fruit = "Strawberries";

        /**
         * Use the enhanced switch expression to assign a color based on the fruit
         */
        String color = switch (fruit){
            // If fruit is Apple, Cherry, or Strawberries, set color to "Red"
            case "Apple", "Cherry", "Strawberries" -> "Red";

            // If fruit is Lemon, Mango, Banana, or Pineapple, set color to "Yellow"
            case "Lemon", "Mango", "Banana", "Pineapple" -> "Yellow";

            // If fruit is Kiwi or Pears, set color to "Green"
            case "Kiwi", "Pears" -> "Green";

            // For any other fruit not listed above
            default -> "Unknown fruit";
        };

        // Print the color associated with the fruit
        IO.println("Fruit color is " + color);
    }
}
