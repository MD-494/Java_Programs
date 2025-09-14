package abstraction.home;

/**
 * Microwave class that extends the abstract class HomeAppliance
 */
public class Microwave extends HomeAppliance {

    //Method for operate the home appliance
    @Override
    void operate() {
        System.out.println("Microwave is heating food.");
    }
}
