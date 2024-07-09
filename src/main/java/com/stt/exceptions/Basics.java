package com.stt.exceptions;

public class Basics {
    public static void main(String[] args) {

        int[] a= {1,2,4,4,7};

        try {
            System.out.println(a[3]);
            int b = a[3]/0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Testing");
    }
}
