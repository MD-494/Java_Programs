package polymorphism.MethodOverriding;

/**
 * Define Manager class extends that extends Employee class
 */
public class Manager extends Employee {
    /**
     * Constructor for Manager that takes a salary parameter
     * @param salary
     */
    public Manager(double salary) {
        super(salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
