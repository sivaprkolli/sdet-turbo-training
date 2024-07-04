package com.stt.oops.multipleInterface;

public class ExecutionTests extends ClassA implements InterfaceA, InterfaceB, InterfaceC {

    @Override
    public void test1() {
        System.out.println("Test1");
    }

    @Override
    public void test3() {
        System.out.println("Test1");
    }

    @Override
    public void test4() {
        System.out.println("Test4");
    }

    @Override
    public void test5() {
        System.out.println("Test5");
    }
}
