package StaticExample;

//Static variable and methods are belong to the class not to its object
//Static var and methods are related to the class and occupy spaces inside the class itself

/*
* In programming languages like Java, classes occupy memory when they are loaded by the JVM (Java Virtual Machine).
* The class is stored in the method area (sometimes referred to as the "class area" or "permanent generation"
* in older JVMs, and now the metaspace). This space is used for storing:
Class metadata (information about the class)
Static variables
Static blocks
Static methods
* */
public class Human {
    String name;
    int age;
    int salary;
    boolean isMarried;
    static int population;


    public Human(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population += 1;
    }



}
