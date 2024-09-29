package OOPS.Polymorphism;

/* Polymorphism = Poly - mean Many and Morphism mean ways to perform a task
Mean performing a same task or job in different ways, called polymorphism.

Class Shape is parent class for Circle, Triangle.
Here it happens Hierarchical inheritance

* */
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(345);
        triangle.area();

        Shape circle = new Circle(23);
        circle.area();
        System.out.println(circle.toString());
    }
}
