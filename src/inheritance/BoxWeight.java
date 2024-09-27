package inheritance;
// child class, child of Box class
public class BoxWeight extends  Box{
    double weight;

    BoxWeight(){
        super(34);
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
        super(l, h, w); // super keyword will call the parent class constructor
        this.weight =weight;
    }
}
