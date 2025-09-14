package abstraction.home;

public abstract class HomeAppliance {

    //Abstract method to operate the home appliance
    abstract void operate();

    //Method for plugging the device to a power source
    public void plugIn() {
            System.out.println("Plugging in ....");
        }
    }
