package nestedforloop;

public class MultiplicationTable {
    static void main(String[] args) {

        // Print the tables from 1 to 10
        for(int i = 2; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
