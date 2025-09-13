package Abstraction.home;

public abstract class Home {

    //Abstract method to operate the home applications
    abstract void operate();

    //Method for plugging the device to a power source
    public void plugIn() {
            System.out.println("Plugging in ....");
        }
    }
