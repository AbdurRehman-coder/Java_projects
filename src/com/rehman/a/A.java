package com.rehman.a;

public class A {
    public static void main(String[] args) {
        System.out.println("Hello America");
        B.greating();
    }
}

class B{
    static void greating(){
        System.out.println("Greeting to the new members.");
    }
}

class MyClass {
    static int count;
  MyClass(){
      System.out.println("my class constructor..");
  }
    // Static block runs when the class is loaded
    static {
        System.out.println("Static block is called.");
        count = 5;
    }

    static void setCount (){
        System.out.println("seCount called..");
        count = 10;
    }
}

