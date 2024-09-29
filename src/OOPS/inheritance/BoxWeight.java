package OOPS.inheritance;
// child class, child of Box class
public class BoxWeight extends  Box{
    double weight;

    BoxWeight(){
        // even if we don't use the super keyword, when we create the object
        // of the child class it automatically calling the default constructor of parent class.
//        super(34);
        System.out.println("This is BoxPrice (Plar)");

        this.weight = -1;

    }

    BoxWeight(double weight){
        // calling the properties of the parent class
        this.l = weight * 5;
        this.w = 34;
        this.h = 20;
        this.weight =weight;
    }

    BoxWeight(double l, double h, double w, double weight){
        // super will always be call first at the method/constructor of child class
        super(l, h, w); // super keyword will call the parent class constructor

        // we can access parent class properties with help of super keywords
        System.out.println("super as this:" + super.h);
        super.w *= 5;
        this.weight =weight;
    }

    BoxWeight(BoxWeight other){
        // Now whats happening here?
        // Basically we pass the Object (other) of type BoxWeight, and parent class has a copyWith or a constructor
        // that accepts Box type. But we are passing BoxWeight to Box, How? why it can't give error.
        // Because here the parent class Box is the reference variable and the BoxWeight is the object to it like
        // Box box1 = new BoxWeigh() --> Box box = other in this case and that's allowed
        super(other);
    }
}
