package com.stt.exceptions;

import java.io.*;

public class Exceptions3 {
    public static void main(String[] args) throws FileNotFoundException {
        //multiCatchBlock();
        //tryAndFinallyBlock();
        getFiles();
        tryAndFinallyBlock();
    }

    public static void tryWithResources(){
        File file = new File("poom.xml");
        try(FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file))
        {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void multipleTryBlocks(){
        try{
            int a = 5;
            try{
                int b = a/0;
            }catch (Exception e1){

            }

        }catch (Exception e){
            throw e;
        }
    }

    public static void getFile() {
        File file = new File("poom.xml");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getFiles() throws FileNotFoundException {
        File file = new File("poom.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
    }

    public static void tryAndFinallyBlock() {
        try {
            int a = 5 / 0;
        } finally {
            System.out.println("Test finally");
        }
    }

    public static void multiCatchBlock() {
        try {
            int[] b = {1, 2, 3, 54, 5};
            System.out.println(b[7]);
            int a = 5 / 0;
        } catch (IndexOutOfBoundsException ie) {
            System.out.println(ie.toString());
        } catch (ArithmeticException fe) {
            System.out.println(fe.toString());
        }
    }
}
