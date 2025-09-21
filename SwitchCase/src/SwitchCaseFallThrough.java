public class SwitchCaseFallThrough {
    static void main(String[] args) {

        // Declare and initialize an integer variable
        int num = 4;

        // Switch statement to match the value of num
        switch (num){
            // If num is 1, this block executes
            case 1:
                IO.println("One");
                // No break here, so it falls through to case 2

            case 2:
                IO.println("Two");
                // Falls through to case 3

            case 3:
                IO.println("Three");
                // Falls through to case 4

            case 4:
                IO.println("Four");
                // Falls through to case 5

            case 5:
                IO.println("Five");
                // Falls through default

            default:
                IO.println("Invalid");
        }
    }
}
