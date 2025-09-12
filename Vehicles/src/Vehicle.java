public class Vehicle {
    public String brand;
    public int speed;

    /**
     * Constructor to initialize a Vehicle object
     * @param brand
     * @param speed
     */
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    /**
     * Prints the details of the vehicle.
     */
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}