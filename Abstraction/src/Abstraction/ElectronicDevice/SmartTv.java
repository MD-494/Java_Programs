package Abstraction.ElectronicDevice;

/**
 * SmartTv class that extends the abstract class ElectronicDevice
 */
public class SmartTv extends ElectronicDevice {

    @Override
    void powerOn() {
        System.out.println("Smart TV is turn on.");
    }

    @Override
    void powerOff() {
        System.out.println("Smart TV is turn off.");
    }
}
