package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human afaan = new Human("Afaan", 8, 2000, false);
        Human salar = new Human("Salar", 31, 300000, true);

        System.out.println(afaan.population);
        System.out.println(salar.population);
    }

    /// Not dependent on objects
    static void fun(){
//        greeting(); // show error because static method should only call static properties; var & methods
    }
    /// if something is not static, belongs to or dependent on objects
    void greeting(){
        System.out.println("Greeting");
    }
}
