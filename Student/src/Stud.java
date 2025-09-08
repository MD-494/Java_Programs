public class Stud {

    /*Instance variables to store student details*/
    String studName;
    int age;
    int rollNo;
    int std;
    double marks;

    /*This line declares parameterize constructor*/
    public Stud(String name, int age, int rollno, int standard, double marks) {
        this.studName = name;
        this.age = age;
        this.rollNo = rollno;
        this.std = standard;
        this.marks = marks;
    }

    /*This method to display student details*/
    public void displayStudentDetails() {
        System.out.println("Student Name : " + studName + "\nAge : " + age + "\nRoll No : " + rollNo + "\nStandard : " + std + "\nMarks : " + marks);
    }

    /*This method indicate student does her homework every evening*/
    public void doStudy() {
        System.out.println(studName + " does her homework every evening.");
    }
}

