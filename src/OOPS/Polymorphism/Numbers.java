package OOPS.Polymorphism;

/// Compile time / Static Polymorphism
/// Achieved via method overloading
public class Numbers {

    /// Method Overloading: Same name but types, arguments, and order can be different.
    /// Here we have same name methods "rates" but its number and order of parameters is different
    int rates(String d, int b){
        return 0;
    }
    int rates(int a, int c){
        return a * c;
    }
    int rates(int a, int c, int q){
        return a * c;
    }
    void rates(){
        System.out.println("total rates");
    }

    public static void main(String[] args) {
        Numbers obj1 = new Numbers();
        obj1.rates();
        System.out.println(obj1.rates(23, 25));
        obj1.rates("hello", 21);
    }
}
