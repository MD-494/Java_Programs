package vehicles;

/**
 * The Bike class extends Vehicle and adds a field 'type' and 'seats'.
 */
public class Bike extends Vehicle {
    private String type;
    private int seats;

    /**
     * Constructor for Bike class
     * @param brand
     * @param speed
     * @param type
     * @param seats
     */

    public Bike(String brand, int speed, String type, int seats) {
        /**
         * Call Vehicle constructor to initialize brand and speed
         */
        super(brand, speed);
        this.type = type;
        this.seats = seats;
    }

    public void printDetails() {
        /**
         * Call Vehicle's printDetails() to print brand and speed and print Bike-specific details
         */
        super.printDetails();
        System.out.println("Type: " + type);
        System.out.println("Seats: " + seats);
    }
}
