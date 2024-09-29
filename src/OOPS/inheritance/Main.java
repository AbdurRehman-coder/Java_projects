package OOPS.inheritance;

public class Main {
    public static void main(String[] args) {
        /// Parent class Objects creation
//       Box box1 = new Box();
//       Box box2 = new Box(4.5);
//       Box box3 = new Box(8.9, 23.3, 442.0);

//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
//        System.out.println(box3.l + " " + box3.h + " " + box3.w);


        /// BoxWeight object
//        BoxWeight bw = new BoxWeight();
//        BoxWeight boxWeight1 = new BoxWeight(34.2);
//        BoxWeight boxWeight2 = new BoxWeight(8.9, 23.3, 442.0,300.2);
//        System.out.println(boxWeight1.weight);
//        System.out.println(boxWeight2.l + " " + boxWeight2.h + " " + boxWeight2.w + boxWeight2+ " " + boxWeight2.weight);

      /* “its important to understand, that the type of the reference variable (left side)
       and not the type of the object (right side) that determines what members and properties can be accessed and what not.”
         mean reference variable type decide which properties to be accessed
       That’s why we cannot access child class properties with box1 in the above case. */
//        Box box4 = new BoxWeight(); // Here we can only access parent class properties
//        System.out.println(box4.l); // fine
//        System.out.println(box4.weight); // Error

        // Because how its possible to create reference of variable of type child class and
        // create the object of parent class, then how we can initialize the variables of child class
        // because here the object is created of parent class (Box()).
//        BoxWeight boxWeight3 = new Box();  // Show error on this

        BoxPrice price = new BoxPrice(45.4444, 4, 5, 6,9);
        System.out.println("price " + price.price);
        System.out.println("weight " + price.weight);
        System.out.println("w " + price.w);
        System.out.println("l " + price.l);
        System.out.println("h " + price.h);

    }
}
