package com.stt.exceptions;

public class TestAAAException {

    public static void main(String[] args) throws AAAException {
        try{
            int a = 5/0;
        }catch (Exception e){
            throw new AAAException("Please correct your formule");
        }

        test1();
    }


    public static void test1(){
        try{
            int a = 5/0;
        }catch (ArithmeticException ae){
            throw new ArithmeticException("Please provide right math");
        }
    }
}
