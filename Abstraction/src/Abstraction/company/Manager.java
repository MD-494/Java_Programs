package Abstraction.company;

/**
 * Manager class implements Employee interface
 */
public class Manager implements Employee {
    @Override
    public void work() {
        System.out.println("Manager is Planning the Projects");
    }

    @Override
    public void role(){
        System.out.println("Manager role is to see the Projects");
    }
}
