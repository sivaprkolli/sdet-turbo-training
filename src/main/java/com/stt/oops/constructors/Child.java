package com.stt.oops.constructors;

public class Child extends Parent {

    public Child(){
        System.out.println("Child Constructor");
    }

    public Child(int id, String name){
        super(100, "Prasad");
        System.out.println("Id  child :: " + id + " and " + " name child :: " + name);
    }

    public static void main(String[] args) {
        //Child child = new Child();
        Child child1 = new Child(500, "Siva");
    }
}
