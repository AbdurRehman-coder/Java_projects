package singleton;

// Singleton classes are used to create only one object of the class
// Never allow the reference variable to call the constructor again and again
public class Singleton {

    // we make it private so it won't be used from outside
    private  Singleton(){

    }

    public static  Singleton instance;

    public static Singleton getInstance() {
        if(instance == null){
           instance = new Singleton();
        }

        return instance;
    }

}
