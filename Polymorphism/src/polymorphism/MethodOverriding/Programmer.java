package polymorphism.MethodOverriding;

/**
 * Define Programmer class that extends the Employee class
 */
public class Programmer extends Employee {

    /**
     * Constructor for Programmer that takes a salary parameter
     * @param salary
     */
    public Programmer(double salary) {
        super(salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
