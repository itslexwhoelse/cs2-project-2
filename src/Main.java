public class Main {
    public static void main(String[] args) {

        Initialize.array(100); //random list of 1-100 to give ids to students

        Student testStudent = new Student("joe",43,4.6);
        System.out.println(testStudent.toString());
        // Create a Student object here
        // test it out here, to make sure you can
        // create a student and output it correctly.

        // should output in the format:
        // Name (ID): grade.
    }

}