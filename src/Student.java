public class Student {
    //instance variables
    private final String studentName;
    private final int studentId;
    private final double studentGpa;

    //constructor
    public Student(String studentName1, int studentId1, double studentGpa1) {
        this.studentName = studentName1;
        this.studentId = studentId1;
        this.studentGpa = studentGpa1;
    }

    // getters
    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }
    public double getStudentGpa() {
        return studentGpa;
    }

    //to String
    public String toString() {
        return studentName + " (" + studentId + "): " + studentGpa; //Name (ID): GPA
    }

    // then make your toString method.


    // we may need to add to it later.
}
