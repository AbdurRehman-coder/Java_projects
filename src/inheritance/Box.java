package inheritance;
// parent class
public class Box {
    double l;
    double w;
    double h;

    public Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
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

    @Override
    public String toString() {
        return STR."l: \{l}, h: \{h}, w: \{h}";
//        return super.toString();
    }
}
