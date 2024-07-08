package com.stt.strings;

public class ReverseAString {

    public static void main(String[] args) {
        String s = "Selenium";
        String s5 = "";
        String s6 = " ";

        System.out.println(s5.isEmpty());
        System.out.println(s6.isEmpty());

        System.out.println(s5.isBlank());
        System.out.println(s6.isBlank());

        char[] c = s.toCharArray(); // ['S', 'e', 'l', .......]

        // one way
        for(int i= c.length-1; i>=0; i--){
            System.out.print(c[i]);
        }

        System.out.println();
        // second style
        for(int j=s.length()-1; j>=0; j--){
            System.out.print(s.charAt(j));
        }

        System.out.println("**************************************");
        String s1 = "Hello Selenium, I'm a master in automation";
        String[] s2 = s1.split(" ");
        for (int i=0;i<s2.length; i++){
            System.out.println(s2[i]);
        }

        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());
    }
}
