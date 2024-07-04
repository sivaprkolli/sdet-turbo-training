package com.stt.introSession;

public class ForLoops {

    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("i :: " + i);
        }

        System.out.println("***********************************");

        for(int i=10; i>0; i--){
            System.out.println(i);
        }

        System.out.println("***********************************");

        for(int i=0; i<20; i=i+2){
            System.out.println("i :: " + i);
        }

        System.out.println("***********************************");

        int[] a = {8,9,4,5,65,7,7,8,9,9,10};
        for (int i:a){
            System.out.println(i);
        }
    }
}
