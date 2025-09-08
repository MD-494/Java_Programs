public class MyLaptop {

    /** Attributes */
    String brand;
    String model;
    int ram;

    /** This line declares parameterize constructor */
    public MyLaptop(String brand, String model, int ram){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }

    /** Method to display laptop details */
    public void displayLaptopDetails(){
        System.out.println("Brand: " + brand + "\nModel: " + model + "\nram: " + ram + "GB");
    }

    /** Method to create a documents */
    public void createDocument() {
        System.out.println("Create a Documents");
    }

    /** Method to run paint application */
    public void runPaintApplication() {
        System.out.println("Run Paint Application");
    }

    /** Method to watch a movie */
    public void watchMovie(){
        System.out.println("Watch a Movie");
        }
    }

