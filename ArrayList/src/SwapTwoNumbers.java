public class SwapTwoNumbers {
    static void main(String[] args) {

        // Swap two numbers using temporary variable
        int a = 2;
        int b = 3;

        IO.println("Before swapping: ");
        IO.println("a = " + a + "\nb = " + b);
        int temp = a;
        a = b;
        b = temp;

        IO.println("After swapping: ");
        IO.println("a = " + a + "\nb = " + b);

        IO.println("-------------------------------------------");

        // Swap two numbers without using third variable
        IO.println("Before swapping: ");
        IO.println("a = " + a + "\nb = " + b);

        a = a+b; // 3+2 = 5
        b = a-b; // 5-2 = 3
        a = a-b; // 5-3 = 2

        IO.println("After swapping: ");
        IO.println("a = " + a + "\nb = " + b);
    }
}
