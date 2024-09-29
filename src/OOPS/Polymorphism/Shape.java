package OOPS.Polymorphism;

public class Shape {
    int w;

    public Shape(int w) {
        this.w = w;
    }

    void area(){
        System.out.println("Area of the shape");
    }

    @Override
    public String toString() {
        return "w " + w;
    }
}
