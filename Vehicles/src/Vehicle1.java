public class Vehicle1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota",150);
        Car c = new Car("Tata Motors", 200, 4);
        Bike b = new Bike("Honda", 180, "Sport", 2);

        System.out.println("Vehicle Details:");
        v.printDetails();

        System.out.println("\nCar Details:");
        c.printDetails();

        System.out.println("\nBike Details:");
        b.printDetails();
    }
}
