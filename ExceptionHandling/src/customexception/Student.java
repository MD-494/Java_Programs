package customexception;

 class NegativeMarks extends Exception {
     public NegativeMarks(String message){
         super(message);
     }
}
public class Student {
    int marks ;

    public Student(int marks) throws NegativeMarks {
        if (marks <= 0) {
            throw new NegativeMarks("Marks cannot be negative");
        }
        this.marks = marks;
    }

    public static void main(String[] args){
        try {
            Student stud = new Student(-80);
        } catch (NegativeMarks e){
            IO.println(e);
        }
    }
}
