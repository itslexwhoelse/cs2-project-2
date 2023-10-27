import java.util.Scanner;

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
                System.out.println("Find by name");
            }
            if (userChoice == 4) {
                System.out.println("Find above");
            }
            if (userChoice == 5) {
                System.out.print("Now exiting.");
                exit = true;
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
    public static void paddedPrompt(String prompt) {
        System.out.println();
        System.out.println(prompt);
        System.out.println();
}
    public static void printMenu() {
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