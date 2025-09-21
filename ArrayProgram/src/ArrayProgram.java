/**
 * Define a class named Vehicle
 */
class Vehicle{
    // Method to start a vehicle
    void start(int car) {
        // Print which vehicle is starting
        System.out.println("Vehicle " + car + " Start Vehicle");
    }
}

public class ArrayProgram {
    public static void main(String[] args) {

        // Creating four instances (objects)
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();
        Vehicle v4 = new Vehicle();

        // Creating an array of Vehicle type to hold vehicle objects
        Vehicle arr[] = new Vehicle[4];

        // Assigning the created vehicle objects to the array elements
        arr[0] = v1;
        arr[1] = v2;
        arr[2] = v3;
        arr[3] = v4;

        for(int i = 0; i < arr.length; i++){
            // Calling the start method of each Vehicle object
            arr[i].start(i+1);
        }
    }
}