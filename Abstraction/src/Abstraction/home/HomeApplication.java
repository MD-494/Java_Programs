package Abstraction.home;

public class HomeApplication {
    public static void main(String[] args) {

        Home washingMachine = new WashingMachine();
        washingMachine.operate();
        washingMachine.plugIn();

        Home refrigerator = new Refrigerator();
        refrigerator.operate();
        refrigerator.plugIn();

        Home microwave = new Microwave();
        microwave.operate();
        microwave.plugIn();
    }
}
