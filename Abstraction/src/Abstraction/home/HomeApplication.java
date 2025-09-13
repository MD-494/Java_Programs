package abstraction.home;

public class HomeApplication {
    public static void main(String[] args) {

        HomeAppliance washingMachine = new WashingMachine();
        washingMachine.operate();
        washingMachine.plugIn();

        HomeAppliance refrigerator = new Refrigerator();
        refrigerator.operate();
        refrigerator.plugIn();

        HomeAppliance microwave = new Microwave();
        microwave.operate();
        microwave.plugIn();
    }
}
