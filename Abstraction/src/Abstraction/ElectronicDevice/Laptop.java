package Abstraction.ElectronicDevice;

/**
 * Laptop class that extends the abstract class ElectronicDevice
 */
public class Laptop extends ElectronicDevice {

    @Override
    void powerOn() {
        System.out.println("Laptop is power on.");
    }

    @Override
    void powerOff() {
        System.out.println("Laptop is shutting down.");
    }
}
