package com.stt.oops.abstraction;

public class AbstractTest extends AbstractImplementation{

    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTest();

        //Parent reference = child instance
        AbstractImplementation abstractImplementation = new AbstractTest();

        //GrandParent reference = Grand child reference
        ParentClass parentClass = new AbstractTest();

        parentClass.test2();
        parentClass.test2("Test");

    }
}
