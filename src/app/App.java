package app;



public class App {
    public static void main(String[] args) throws Exception {
      Student  obj = new Haris();
        obj.Rollno();
        obj.address();
        obj.name();
        System.out.println(obj);
        System.out.println(" a = " + obj.a);
        obj.a=300;
        System.out.println("a: " + obj.a);
        Student obj1 = new Abid();
        obj1.name();
        obj1.address();
        
        System.out.println("Abid Details: " + obj1 );


      
    }
}