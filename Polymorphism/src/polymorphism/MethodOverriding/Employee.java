package polymorphism.MethodOverriding;

/**
 * Writ a program t create a class Employee with a method called calculateSalary().
 * Create two subclasses Manager and Programmer.
 * In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
 */

public class Employee {
    // Instance variable to store yhe employee's salary
    double salary;

    /**
     * Constructor to initialize the employee's salary
     * @param salary
     */
    public Employee(double salary) {
        this.salary = salary;
    }

    /**
     * Calculates the salary of the employee
     * @return Salary of the employee
     */
    public double calculateSalary() {
        return 0;
    }
}
