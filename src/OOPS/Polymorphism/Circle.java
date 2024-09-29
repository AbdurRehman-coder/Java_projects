package OOPS.Polymorphism;

public class Circle extends Shape{
    int length;

    public Circle(int length) {
        super(length);
        this.length = length;
    }

//    @Override
//    void area(){
//        System.out.println("Area of Circle: Pi * r * r");
//    }
}
