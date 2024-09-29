package OOPS.inheritance;
// parent class
public class Box {
    double l;
    double w;
    double h;

    public Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
        System.out.println("This is BoxPrice (Neeka)");

    }

    // square box with same value
      Box(double value){
        this.l = value;
        this.w = value;
        this.h = value;
      }

      Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
      }
      // passing the other object of its own type
      Box(Box box){
        this.l = box.l;
        this.h = box.h;
        this.w = box.w;
      }

    @Override
    public String toString() {
        return STR."l: \{l}, h: \{h}, w: \{h}";
//        return super.toString();
    }
}
