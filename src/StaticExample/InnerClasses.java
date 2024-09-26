package StaticExample;

import org.w3c.dom.Text;

public class InnerClasses {
    static  class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClasses inner = new InnerClasses();
       Test a = new Test("Rehman");
        Test b = new Test("Ujala");
        InnerClasses a1 = new InnerClasses();

        /// We can also access like this, if inner class is not a static one
//        InnerClasses inner = new InnerClasses();
//        InnerClasses.Test a = new InnerClasses.Test("Rehman");
//        InnerClasses.Test b = new InnerClasses.Test("Ujala");
//        InnerClasses a1 = new InnerClasses();

        System.out.println(a.name + " " + b.name);
    }
}

/// Interview question
class  A{
    static  String name;
    public A(String name) {
        this.name = name;
    }
}

class  B{
    public static void main(String[] args) {
        A a1 = new A("Saim");
        A a2 = new A("Ayub");
        System.out.println(STR."name : \{a1} \{a2}");
        // output: name : Ayub Ayub
        // Because its static and its class dependent and independent of objects
        // so if we have different value for different objects for the static variable
        // it will pick only the recent added one.
    }
}
