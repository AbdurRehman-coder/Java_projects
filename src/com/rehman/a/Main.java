package com.rehman.a;

import static com.rehman.a.MyClass.setCount;
public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        setCount();
        System.out.println("Main method is running.");

        System.out.println(MyClass.count); // Accessing static variable without creating an object


    }
}
