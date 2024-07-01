package com.stt.oops.Inheritance;

public class Parent {

    public void login(String username, String password){
        System.out.println("username :: " + username);
        System.out.println("password :: " + password);
    }

    public static void payment(){
        System.out.println("Payment completed");
    }
}
