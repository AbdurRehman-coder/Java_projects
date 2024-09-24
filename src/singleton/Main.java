package singleton;

public class Main {
    public static void main(String[] args) {
        /// these obj1, obj2, obj3 will only only the one same object that is created
        /// and will common for all this
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
    }
}
