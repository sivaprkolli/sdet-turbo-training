package com.stt.oops.abstraction2;

public class Implementation2 extends ImplementMethods{
    @Override
    public String verifyPayment(String message) {
        System.out.println("message :: " + message ) ;
        return message;
    }
}
