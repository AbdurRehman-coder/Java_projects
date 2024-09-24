package StaticExample;

public class StaticBlock {
    static  int a = 3;
    static  int b;

    // This static block will call only once, when the JVM load this class it first time
    // This block is calling before constructor is being called.
    static {
        System.out.println("I'm in the static block");
        b = a * 4;
    }

    public static void main(String[] args) {
        System.out.println(STR."\{a} \{b}");
    }
}
