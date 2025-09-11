package vehicles;

/**
 * The Car class extends Vehicle and adds a field 'seats'.
 */
public class Car extends Vehicle {

    // Private access modifier is only accessible within the Car class
    private int seats;

    /**
     * Constructor for Car class
     * @param brand
     * @param speed
     * @param seats
     */

    public Car(String brand, int speed, int seats) {
        /**
         * Call Vehicle constructor to initialize brand and speed
         */
        super(brand, speed);
        this.seats = seats;
    }

    public void printDetails() {

        /**
         * Call Vehicle's printDetails() to print brand and speed and print car-specific details
         */
        super.printDetails();
        System.out.println("Seats: " + seats);
    }
}
