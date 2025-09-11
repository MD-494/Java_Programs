package vehicles;

public class Vehicle {

    /**
     * Protected access modifier is accessible in subclasses and same package
     */
    protected String brand;
    protected int speed;

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
