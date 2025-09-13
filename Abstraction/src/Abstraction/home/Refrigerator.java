package Abstraction.home;

/**
 * Refrigerator class that extends the abstract class Home
 */
public class Refrigerator extends Home {

        @Override
        void operate() {
            System.out.println("Refrigerator is cooling food.");
        }
}
