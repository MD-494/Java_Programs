package Abstraction.company;

/**
 * Developer class implements Employee interface
 */
public class Developer implements Employee {

    @Override
    public void work() {
        System.out.println("Developer is writing the code");
    }

    @Override
    public void role() {
        System.out.println("Developer role is to Writing the code and tests software");
    }
}
