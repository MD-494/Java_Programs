package abstraction.company;

/**
 * Hr class implements Employee interface
 */
public class Hr implements Employee {
    @Override
    public void work() {
        System.out.println("HR is managing recruitment");
    }

    @Override
    public void role() {
        System.out.println("HR role is to Handles hiring and conducting a job interview");
    }
}
