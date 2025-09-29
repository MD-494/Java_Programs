package trycatchblock;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            int divideByZero = 10 / 0;
        } catch (ArithmeticException e){
            IO.println("Cannot divide by zero");
        } finally {
            IO.println("Finally block is executed");
        }
    }
}
