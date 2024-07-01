package com.stt.oops.Inheritance;


/**
 * Inheritance - mainly for re-usability
 */
public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();

       // Parent parent = new Parent();
        child.login("Selenium", "Test2123");
        payment();
        booking();
    }

    public static void booking(){
        System.out.println("Booking completed");
    }
}
