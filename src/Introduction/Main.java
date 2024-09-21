package Introduction;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int[] rollNo = new int[5];
    String[] names = new String[5];
    float[] marks = new float[5];

    rollNo[3] = 23;
    System.out.println(Arrays.toString(rollNo) + Arrays.toString(names) + Arrays.toString(marks));

//    Student[] students = new Student[5];
//        System.out.println(students[1]);

        /// call default constructor
        Student rehman = new Student();
//        rehman.name = "Rehman Khan";
//        rehman.marks = 23.2f;
//        rehman.setMarks(76);
        System.out.println(rehman.name);
        System.out.println(rehman.marks);

        Student firstStudent = new Student("Ujala Arshad", 45, 80.5f);
        System.out.println(firstStudent.name + " " + firstStudent.rollNo+ " " + firstStudent.marks);


        /// When passing one object to another, it is passing by reference
        /// mean if we assign that object to another it will just change the reference
        Student one = new Student();
        Student two;
        two = one; // Here both reference var reference to the same object in Heap memory
        one.name = "something happening......";
        System.out.println("one: " + one.name + " two: " + two.name);

    }
}

class Student{
    int rollNo;
    String name;
    float marks;

    /// We need a way to add the values of the above
    /// properties object by object

    void greetings(){
        System.out.println("hello from the deep ocean...");
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    /// Default Constructor
    /// This will be automatically called.
    Student(){
        /// This is how we can call a constructor from another constructor
        /// Here this is represent the class itself
        /// Internally its something like this Student("Heela Kakar", 23, 89.4f);
        this("Heela Kakar", 23, 89.4f);
        ///Here this keyword is pointing the current object of the class
        ///e.g: Student student1=new Student(), then here this is point/replace
        ///with student1 reference variable
//        this.name = "Abdur Rehman"; // like student1.name
//        this.marks = 332.23f;
//        this.rollNo = 13;



    }

    /// Parametrized Constructor
    /// Student arpit = new Student("Arpit", 34, 66.4f);
    /// Here "this" will be replaced with arpit
    Student(String name, int rollNo, float markss){
        this.name = name; // this. --> to current object
        this.rollNo = rollNo;
        marks = markss;
//        setMarks(marks);
    }
}