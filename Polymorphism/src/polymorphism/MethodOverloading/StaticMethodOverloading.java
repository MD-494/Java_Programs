package polymorphism.MethodOverloading;

/**
 * Define a Calculator class with static methods for calculations
 */
class Calculator{

    /**
     * Static method to calculate the area of rectangle
     */
    public static int calculate(int length, int width){
        return length * width;
    }

    /**
     * Static method to calculate the sum of three numbers
     */
    public static double calculate(double a, double b, double c){
        return a + b + c;
    }

    /**
     * Static method for concatenation of two Strings
     */
    public static String calculate(String name, String surname){
        return name + surname;
    }
}

public class StaticMethodOverloading {
    public static void main(String[] args) {

        System.out.println("Area of Rectangle: " + Calculator.calculate(2,4));
        System.out.println("Addition is: " + Calculator.calculate(1.5,2.5,5.5));
        System.out.println("Concatenation: " + Calculator.calculate("Mansi", "Dangat"));
        System.out.println("Multiplication is: " + Calculator.calculate(4,2,6));
    }
}
