package com.stt.introSession;

public class Arrays2 {

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = new int[]{1,2,34,5,5};
        int temp;

        String s = new String("Selenium");
        Integer j = new Integer(5);

        for(int i=0; i<arr1.length; i++){
            temp = arr1[i]+1;
            System.out.println(temp);
        }
    }
}
