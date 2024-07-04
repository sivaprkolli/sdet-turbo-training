package com.stt.introSession;

public class SimpleCondition {
    public static void main(String[] args) {
        if(false){
            System.out.println("Pass");
        }
        else if(false){
            System.out.println("2nd Condition Pass");
        }

        else if(true){
            System.out.println("3nd Condition Pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
