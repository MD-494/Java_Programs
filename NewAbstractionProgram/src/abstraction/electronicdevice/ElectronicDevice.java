package abstraction.electronicdevice;

public abstract class ElectronicDevice {

    //Abstract method to turn on the device
    abstract  void powerOn();

    //Abstract method to turn off the device
    abstract void powerOff();

    //Method for connecting the device to Wi-Fi
    public void connectToWiFi() {
        System.out.println("Connecting to WiFi.");
    }
}
