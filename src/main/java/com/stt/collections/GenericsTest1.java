package com.stt.collections;

public class GenericsTest1<T> {

    T object;

    public GenericsTest1(T object){
        this.object = object;
    }

    public T getAutomationToolName(){
        System.out.println(object);
        return object;
    }

}
