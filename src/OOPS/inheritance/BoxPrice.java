package OOPS.inheritance;
// Box -> BoxWeight -> BoxPrice [ Multi-Level OOPS.inheritance ].
public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice() {
        System.out.println("This is BoxPrice (Namsay)");
        this.price = -1;
    }

  BoxPrice(double price){
      super();
        this.weight = 23;
//        this.w = 23;
        super.h = 3499;
        super.l = 100;
  }

  BoxPrice(double w, double l, double h, double weight, double price){
        super(w, l, h, weight);
  }
}
