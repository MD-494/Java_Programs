package Abstraction.home;

/**
 * Microwave class that extends the abstract class Home
 */
public class Microwave extends Home {

    @Override
    void operate() {
        System.out.println("Microwave is heating food.");
    }
}
