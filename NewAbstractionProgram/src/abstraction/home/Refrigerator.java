package abstraction.home;

/**
 * Refrigerator class that extends the abstract class HomeAppliance
 */
public class Refrigerator extends HomeAppliance {

    //Method for operate the home appliance
    @Override
    void operate() {
        System.out.println("Refrigerator is cooling food.");
    }
}
