package com.stt.oops.constructors;

public class ConstructorTest {

    public String name;

    public ConstructorTest(String name){
        this.name = name;
        System.out.println("name :: " + name);
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest("Siva");
        String str = constructorTest.getName();
        System.out.println("Actual Name :: " + str);
    }
}
