# Description

You are to implement three classes: a Student class, a Course class, and a Main class.

## Student

A Student should contain a name, a student ID, and a grade (from 0 to 100). When you output a Student (or call its `toString` method), it should output the student in the following format: name (ID): grade. For example, if the Student’s name is “Athar”, their ID is 1, and their grade is 97, we would output:

> Athar (1): 97

**You may need to add other methods to this class!** Most likely, you will need to figure out what to add to this class based on what is required in the Course class.

## Course

The Course class should contain a list of Students. It should also have the following methods:

* **add**: the “add” method should take in a **Student** as a parameter, and add it to its list of students.
* **listAllStudents**: the “listAllStudents” method should output all the student in a numbered list (see the output in the example below).
* **findStudentByName**: this method should take in a String “name” as a parameter, search for a Student with that title, and then output the Student along with its position in the list. If there is no student with that name in the list, this method should output a message saying that there are no students with that name.

Sample output:

> 2. Carl (3): 85

(The Student was found in position 2 in the list.)

* **findAllStudentsAboveGrade**: this method should take in an integer “grade” as a parameter, search for all Students with a grade as high or higher, and output all of those Students, along with their positions in the list (see the output below). If there are no Students who scored that high in the course, the method should output a message saying that there are no Students with that grade or better.

Sample output (suppose grade is 95)
>	0. Athar (1): 97  
>	3. David (4): 95

(These students were found in positions 0 and 3 in the list.)

## Main

Your Main class should contain your main method. It should instantiate a Course object, and then enter in a **loop.** In the loop, it should output a menu:

1. Add a Student
2. List all students
3. Find student (by name)
4. Find all students above grade
5. Quit

It should then take in the user’s input. If the user inputs in 1, it should prompt the user for the name, ID, and grade of the student, and then call the “add” method on the Course object. If the user inputs 2, it should call the listAllStudents method on the Course object. If the user inputs 3, it should prompt the user for a name, and then call the findStudentByName method on the Course object (with the name as an argument). If the user inputs 4, it should prompt the user for a grade, and then call the findAllStudentsAboveGrade method on the Course object (with the grade as an argument).

After doing any of these, it should loop around (display the menu again and take in the user’s input choice again). It should keep looping as long as we do not enter in choice “5”.

(If the user inputs in something other than 1 - 5, it should output “invalid choice”, but continue to loop around.)

## Example

>Menu:  
>1) Add a Student  
>2) List all students  
>3) Find student (by name)  
>4) Find all students above grade  
>5) Quit  
> Enter in a choice: 1. 

> Input the student’s name: Athar  
>Input the student’s ID: 1  
>Input the student’s grade: 97  
>Okay, Athar (1): 97 was successfully added to the course!

>Menu:  
>1) Add a Student  
>2) List all students  
>3) Find student (by name)  
>4) Find all students above grade  
>5) Quit  
>Enter in a choice: 1

>Input the student’s name: Barry  
>Input the student’s ID: 2  
>Input the student’s grade: 81 
>Okay, Barry (2): 81 was successfully added to the course!

> Menu:
>1) Add a Student  
>2) List all students  
>3) Find student (by name)  
>4) Find all students above grade  
>5) Quit  
>Enter in a choice: 1  

> Input the student’s name: Carl  
>Input the student’s ID: 3  
>Input the student’s grade: 85  
>Okay, Carl (3): 85 was successfully added to the course!  

> Menu:  
>1) Add a Student  
>2) List all students  
>3) Find student (by name)  
>4) Find all students above grade  
>5) Quit  
>Enter in a choice: 1

> Input the student’s name: David  
>Input the student’s ID: 4  
>Input the student’s grade: 95  
>Okay, David (4): 95 was successfully added to the course!  

> Menu:
>1) Add a Student  
>2) List all students  
>3) Find student (by name)  
>4) Find all students above grade  
>5) Quit  
>Enter in a choice: 2

> 0. Athar (1): 97  
>1. Barry (2): 81
>2. Carl (3): 85
>3. David (4): 95

> Menu:  
>1) Add a Student  
>2) List all students  
>3) Find student (by name)  
>4) Find all students above grade  
>5) Quit  
>Enter in a choice: 4

> Input in the grade: 90

> 0. Athar (1): 97  
>3. David (4): 95

> Menu:  
>1) Add a student  
>2) List all students  
>3) Find student (by name)  
>4) Find all students above grade  
>5) Quit  
>Enter in a choice: 5

> Have a nice Day!
>(exits)

# Grading

Out of 100 points:

* 25 points if your submission **compiles** without any errors
* 50 points for **completion**: 
  * 10 points for the “menu” (including the functionality of displaying the menu and getting the user’s choice every single time, until they choose to quit).
  * 10 points for “add a student”
  * 10 points for “list all students”
  * 10 points for “find student by name”
  * 10 points for “find all students above grade”
* 25 points for **style/readability**. Break your code up into small methods that each have specific jobs. Have good variable names (which suggest what they are used for), use proper indentation, include comments that describe what each part of your code does and (more importantly) why.
