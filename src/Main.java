import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
import java.util.Random;

class Main {
    private  static  boolean exit = false;
    public static void main(String[] args) {
        while(!exit) {
            int userChoice = menu();
            if (userChoice == 0) {
                menu();
            }
            if (userChoice == 1) {
                createStudent();
                userChoice = 0;
            }
            if (userChoice == 2) {
                Course.listAllStudents();
                userChoice = 0;
            }
            if (userChoice == 3) {
                Course.findStudentByName();
                userChoice = 0;
            }
            if (userChoice == 4) {
                Course.findAllStudentAboveGrade();
                userChoice = 0;
            }
            if (userChoice == 5) {
                System.out.print("Now exiting.");
                exit = true;
            }
            if (userChoice == 6) {
                populate();
                userChoice = 0;
            }

            }
            System.exit(0);
        }

    public static int menu() {
        int selection;


        Scanner userInput = new Scanner(System.in);
        printMenu();
        while (!userInput.hasNextInt()) {
            paddedPrompt("not a valid input");
            userInput.next();
            printMenu();
        }
        selection = userInput.nextInt();
        return selection;
    }

    public static void createStudent() { //good GOD this method is ugly
        Scanner in = new Scanner(System.in);

        System.out.print("Input the student’s name: ");
          String studentName = in.next();

        System.out.print("Input the student’s ID: ");
            while (!in.hasNextInt()) {
            System.out.println("invalid ID");
            in.next();
            System.out.print("Input the student’s ID: ");
            }
          int studentId = in.nextInt();

        System.out.print("Input the student’s GPA: ");
            while (!in.hasNextDouble()) {
                in.next();
                paddedPrompt("invalid GPA");
                System.out.print("Input the student’s GPA: ");
            }
                double studentGpa = in.nextDouble();
            if (studentGpa >= 4.0 || studentGpa <= 0.0) {
                paddedPrompt("invalid GPA, must be 0-4");
                System.out.print("Input the student’s GPA: ");
                studentGpa = in.nextDouble();
            }

        Student newStudent = new Student(studentName,studentId,studentGpa);
        Course.add(newStudent);
        System.out.print("\nStudent " + studentName + " added to course.\n");

    }

    //helper methods
    public static double randomGpa() { //returns a random gpa not optimal output but this is just for testing purposes.
        double max = 4.0;
        double min = 1.0;

        Random random = new Random();
        double randomDouble = random.nextDouble()*(max - min)+min;
        return randomDouble;
    }

    public static void populate() { //helper method, populates the course with preset students for testing
        Scanner in = new Scanner(System.in);
        System.out.print("enter amount: ");
        if (!in.hasNextInt()) {
            System.out.println("not valid");
        }
        int amountOfStudents = in.nextInt();
        for (int i = 0; i <= amountOfStudents; i++) {
            Student student = new Student("student"+i,i,randomGpa());
            Course.add(student);

        }
        System.out.println("added " + amountOfStudents + " students");
    }

    public static void paddedPrompt(String prompt) {
        System.out.println();
        System.out.println(prompt);
        System.out.println();
}
    public static void printMenu() { //do i really need to explain this one?
        System.out.println();
        System.out.println("Menu:");
        System.out.println("------------------------------------");
        System.out.println("1. Add a student");
        System.out.println("2. List all students");
        System.out.println("3. Find student (by name)");
        System.out.println("4. Find all students above grade");
        System.out.println("5. Quit");
        System.out.print("   Enter choice: ");

    }

}