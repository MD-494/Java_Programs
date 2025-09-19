package polymorphism.MethodOverriding;

class Camera{

    /**
     * Define a static method brand
     */
    public static String brand(String camera){
        return camera;
    }
}

/**
 * Define a Dslr class that extends Camera class
 * Dslr(Digital single lens reflex
 */
class Dslr extends Camera{
    /**
     * Define a static method brand
     */
    public static String brand(String cameraBrand){
        return cameraBrand;
    }
}

public class StaticMethodOverriding {
    public static void main(String[] args) {

        System.out.println("Camera: " + Camera.brand("Generic Camera"));
        System.out.println("DSLR Brand: " + Dslr.brand("Nikon"));
    }
}