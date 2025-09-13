package Abstraction.ElectronicDevice;

public class ElectronicDeviceApplication {
    public static void main(String[] args) {

        ElectronicDevice laptop = new Laptop();
        laptop.powerOn();
        laptop.powerOff();
        laptop.connectToWiFi();

        ElectronicDevice smartPhone = new SmartPhone();
        smartPhone.powerOn();
        smartPhone.powerOff();
        smartPhone.connectToWiFi();

        ElectronicDevice smartTv = new SmartTv();
        smartTv.powerOn();
        smartTv.powerOff();
        smartTv.connectToWiFi();
    }
}
