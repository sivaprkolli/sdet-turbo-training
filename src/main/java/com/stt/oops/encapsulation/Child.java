package com.stt.oops.encapsulation;

public class Child extends Parent{

    public static void main(String[] args) {
        Child child = new Child();
        child.setId(100);
        child.setName("Prasad");
        System.out.println(child.getId());
        System.out.println(child.getName());
    }
}
