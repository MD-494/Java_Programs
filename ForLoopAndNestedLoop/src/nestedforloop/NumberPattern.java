package nestedforloop;

public class NumberPattern {
    static void main(String[] args) {

        // Print number pattern
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
