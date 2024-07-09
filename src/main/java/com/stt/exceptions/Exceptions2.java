package com.stt.exceptions;

public class Exceptions2 {
    static int a;
    public static void main(String[] args) {
        System.out.println("Automation testing");

        tryCatchBlock();
        fullBlock();

    }

    public static void stopTheExecutionIfTestFailsUsingTryCatch(){
        try{
            a= 5/0;
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println(e.toString());
            throw e;
        }
        finally {
            System.out.println("Test finally");
        }
        System.out.println("Test Pass");
    }

    public static void fullBlock(){
        try{
            System.out.println("Try Block");
        }catch (Exception e){
            System.out.println("Catch Block");
            throw e;
        }finally {
            System.out.println("Finally");
        }
    }

    public static void tryCatchBlock(){
        try{
            int a = 6/0;
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            throw ae;
        }
    }
}
