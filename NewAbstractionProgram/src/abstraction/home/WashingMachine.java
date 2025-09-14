package abstraction.home;

/**
 * WashingMachine class that extends the abstract class HomeAppliance
 */
public class WashingMachine extends HomeAppliance {

    //Method for operate the home appliance
    @Override
    void operate() {
        System.out.println("Washing machine is washing clothes.");
    }
}

