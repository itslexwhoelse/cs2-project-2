import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Course {
    //Instance Vars
    static ArrayList<Student> studentList = new ArrayList<>();

    public void course() {

    }


    //Constructor
    public static void add(Student student) {
        studentList.add(student);
    }

    public static void listAllStudents() {
        System.out.println();
        System.out.println("Students enrolled: ");

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(i + ". " + studentList.get(i));
        }

    }

    public static void findStudentByName() {
        Scanner sc = new Scanner(System.in);
        boolean studentFound = false;
        System.out.print("Input in the name: ");
        String studentName = sc.next();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStudentName().equals(studentName)) {
                System.out.println(i + ". " + studentList.get(i));
                studentFound = true;
            }
        }
        if (!studentFound) {
            System.out.println("There are no students with that name");
        }
    }

    public static void findAllStudentAboveGrade() {
        //search every student in list
        //if the student has a gpa above X put them in a list
        //return that list
        // if none with that gpa return "there are no students with that grade"
        Scanner in = new Scanner(System.in);
        System.out.print("Input GPA: ");
        if (!in.hasNextDouble()) {
            System.out.println("invalid input");
        }
        double minGpa = in.nextDouble();
        for (Student student : studentList) {
            if (student.getStudentGpa() > minGpa){
                System.out.println(student.toString());
            }
        }
    }
    
    public static void addStudent(Student student) {
        //add the student to the course array
        studentList.add(student);
        System.out.println(studentList);
        
        
    }



























    /*
    this needs a course class
        list of all students

        methods:
            add: takes (Student and adds to the list
            listAllStudents: outputs students in a numbered list
                2 - Carl (3): 85
            findStudentByName: takes in a name search and output
                2 - Carl (3): 85
               if no student by that name
                "there is no student by that name."
            findAllStudentsAboveGrade: in integer grade  if Student grade >= grade print in a list
                0 - Carl (3): 85 //if grade = 85
                1 - Steve (4): 87

     */
}
