import java.util.Scanner;

class Main {
    private  static  boolean exit = false;
    public static void main(String[] args) {
        while(!exit) {
            int userChoice = menu();
            switch (userChoice) {
                case 1 -> {
                    createStudent();
                }
                case 2 -> {
                    Course.listAllStudents();
                    userChoice = 0;
                    menu();
                }
                case 3 -> System.out.println("Find by name");
                case 4 -> System.out.println("Find above");
                case 5 -> {
                    exit = true;
                    System.out.print("Now exiting.");
                }

            }
            System.exit(0);



        }

    }
    public static int menu() {
        int selection;


        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Menu:");
        System.out.println("------------------------------------");
        System.out.println("1. Add a student");
        System.out.println("2. List all students");
        System.out.println("3. Find student (by name)");
        System.out.println("4. Find all students above grade");
        System.out.println("5. Quit");
        System.out.print("   Enter choice: ");


        selection = userInput.nextInt(); /* needs validation */
        return  selection;
    }
    public static void createStudent() { /*validate with valid input */
        Scanner in = new Scanner(System.in);
        System.out.print("Input the student’s name: ");
         String studentName = in.next();
        System.out.print("Input the student’s ID: ");
         int studentId = in.nextInt();
        System.out.print("Input the student’s GPA: ");
         double studentGpa = in.nextDouble();
        Student newStudent = new Student(studentName,studentId,studentGpa);
        Course.add(newStudent);
        System.out.print("Student " + studentName + " added to course.");


    }



}