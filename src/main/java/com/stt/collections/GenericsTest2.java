package com.stt.collections;

public class GenericsTest2 {

    public static void main(String[] args) {
        GenericsTest1<String> genericsTest1 = new GenericsTest1<String>("Selenium");
        GenericsTest1<Integer> genericsTest2 = new GenericsTest1<Integer>(4);
        GenericsTest1 genericsTest3 = new GenericsTest1(2.0);
        genericsTest1.getAutomationToolName();
        System.out.println(genericsTest1.object);
        System.out.println(genericsTest3.object);
    }
}
