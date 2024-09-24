package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human afaan = new Human("Afaan", 8, 2000, false);
        Human salar = new Human("Salar", 31, 300000, true);

        System.out.println(afaan.population);
        System.out.println(salar.population);
        fun(); //it is acessing b/c its static
//        greeting(); // show error, cause we need to create object for this to access non-static properties
    }

    /// Not dependent on objects
    static void fun(){
//        greeting(); // show error because static method should only call static properties; var & methods

        /// We cannot access non-static stuff without referencing their instances in
        /// a static context, so to access non static method we can create class obj for it.
        Main ref = new Main();
        ref.greeting();
    }
    /// if something is not static, belongs to or dependent on objects
    void greeting(){
        System.out.println("Greeting");
    }
}
