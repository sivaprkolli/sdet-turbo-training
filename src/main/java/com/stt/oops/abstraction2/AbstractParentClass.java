package com.stt.oops.abstraction2;

public abstract class AbstractParentClass {

    public void login(String un, String pwd){
        System.out.println(un + " :: " + pwd);
    }

    public String getUserName(String name){
        System.out.println("name :: " + name);
        return name;
    }

    public abstract void completePayment(String creditCard);

    public abstract String verifyPayment(String message);
}
