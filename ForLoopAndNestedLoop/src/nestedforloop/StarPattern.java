package nestedforloop;

public class StarPattern {
    static void main(String[] args) {

        // Print star pattern
        for(int i=1; i<=4;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
