package polymorphism.MethodOverloading;

/**
 * Define StudentDetails class to store student information
 */
class StudentDetails {
    /**
     * Method to retrieve student information
     * @param studName Student name
     * @param fName Father name
     * @param sName Surname
     * @return String containing the student information
     */
    String studInfo(String studName, String fName, String sName){
        // Concatenate the student's name, father's name, and surname
        String info = studName +" "+ fName +" "+ sName;
        return info;
    }

    /**
     * Method to retrieve student age
     * @param age Student age
     * @return The student age
     */
    int studInfo(int age){
        int info = age;
        return info;
    }

    /**
     * Method to retrieve family information
     * @param fatherName
     * @param motherName
     * @param brotherName
     * @param sisterName
     * @return String containing the family information
     */
    String studInfo(String fatherName, String motherName,String brotherName, String sisterName){
        // Concatenate the family members names with newline characters
        String info = fatherName + "\n" + motherName + "\n" + brotherName + "\n" + sisterName;
        return info;
        }
    }

    public class StudentInfo {
        public static void main(String[] args) {

            StudentDetails stud = new StudentDetails();

            System.out.println(stud.studInfo("Mansi", "Navnath", "Dangat"));
            System.out.println(stud.studInfo(21));
            System.out.println(stud.studInfo("Navnath", "Sheetal", "Siddhesh", "Shreya \nSwara"));
        }
    }
