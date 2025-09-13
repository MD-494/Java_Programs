package Abstraction.company;

public class CompanyApplication {
    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.work();
        manager.role();

        System.out.println("-----------------------------------------");

        Employee developer = new Developer();
        developer.work();
        developer.role();

        System.out.println("-----------------------------------------");


        Employee hr = new Hr();
        hr.work();
        hr.role();
    }
}
