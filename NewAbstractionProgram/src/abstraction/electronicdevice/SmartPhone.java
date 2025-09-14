package abstraction.electronicdevice;

/**
 * SmartPhone class that extends the abstract class ElectronicDevice
 */
public class SmartPhone extends ElectronicDevice {

    @Override
    void powerOn() {
        System.out.println("Smartphone is turn on.");
    }

    @Override
    void powerOff() {
        System.out.println("Smartphone is turn off.");
    }
}

