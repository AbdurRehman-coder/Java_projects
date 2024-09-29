package OOPS.Polymorphism;

public class Triangle extends Shape{
    public Triangle(int w) {
        super(w);
    }

    void area(){
        System.out.println("Area of Triangle");
    }
}
