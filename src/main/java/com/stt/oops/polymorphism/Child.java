package com.stt.oops.polymorphism;

public class Child extends Parent{

    public static void main(String[] args) {

        Parent parent = new Parent();

        Child child = new Child();
        child.sum(5, 5, 5);

        parent.testAutomation();
        child.testAutomation();
    }

    @Override
    public void testAutomation(){
        System.out.println("Selenium Automation");
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(int a, double b){
        System.out.println(a+b);
    }

    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
