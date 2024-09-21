package Introduction;

public class SwapExample {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;

        ///Objects are passing by reference but it still not working
        ///Because this Integer is a wrapper class and its final
        Integer a = 5;
        Integer b = 10;
        System.out.println(a + " " + b);

        ///It will not swap the above primitive a & b, because in Java everything is pass by
        ///value and not by reference. so here its passing the 5 & 10 value.
        ///The swap value is only swapping inside the method because parameter scoop
        ///is only to that specific method
        swap(a, b);
        System.out.println(a + " " + b);

        /// "final" Keyword
        /* final always initialize while declaring e.g: final int INCREASE = 24;
        * final guarantees immutability mean will value will never change only
        * if the instance variable are primitive data types and the reference/object types.
        * If instance variable of reference or object type is final then reference of
        * this variable to the object will never change, mean we cannot reassign the
        * reference variable to other object, But the value of object itself can change.
        * */
        final A one = new A(20);
        A two = new A(32);
//        one = two; // it show error, because we cannot re assign the reference to other object in Heap.
        one.rollNo = 8990; // but we can change object value itself
        System.out.println("AB: " + one.num + " AA: " + two.num );
    }

     static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


}


class A{
    /// final var always initialized while declaring
    final int num;
    int rollNo;

    A(int num) {
        this.num = num;
    }
}

