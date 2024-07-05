package com.stt.oops.constructors;

public class SimpleTest {

    public SimpleTest(){
        System.out.println("Test Constructors");
    }

    public SimpleTest(String name){
        System.out.println("Test Selenium");
        System.out.println("Language name ::" + name);
    }


    public String test1(){
        System.out.println("Automation Testing");
        return "Text";
    }

    public static void main(String[] args) {
        SimpleTest simpleTest = new SimpleTest();
        SimpleTest simpleTest1 = new SimpleTest();
        SimpleTest simpleTest2 = new SimpleTest("Java");
    }
}
