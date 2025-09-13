package abstraction.company;

public interface Employee {

    //Employee performs work
    void work();

    /**
     * Default method to describe th role of employee
     */
    public default void role() {
        System.out.println("This is a company employee.");
    }
}
