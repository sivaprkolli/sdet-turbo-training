package com.stt.oops.abstraction2;

public abstract class ImplementMethods extends AbstractParentClass{

    @Override
    public void completePayment(String creditCard) {
        System.out.println("creditCard :: " + creditCard);
    }

}
