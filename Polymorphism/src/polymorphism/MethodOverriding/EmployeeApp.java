package polymorphism.MethodOverriding;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee manager = new Manager(60000);
        System.out.println("Manager salary: " + manager.calculateSalary());

        Employee programmer = new Programmer(50000);
        System.out.println("Programmer salary: " + programmer.calculateSalary());
    }
}