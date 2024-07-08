package com.stt.strings;

public class PartialComparisionMethods {

    public static void main(String[] args) {
        String s = "Selenium";
        String s1 = "Selenium";
        String s2 = new String("Selenium");
        String s3 = new String("Selenium");

        String s4 = "Selenium Automation";
        String s5 = "         Sele nium             ";
        String s6 = "Selenium#$%^&*()(*&^%$#@";
        String s7 = "#$%^&*()_)(*&Selenium";
        String s8 = new String("selenium");
        String s9 = new String("SELENIUM");

        System.out.println(s.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3 == s2); // false

        System.out.println("******************************");
        System.out.println(s.contains(s5)); // false
        System.out.println(s9.equalsIgnoreCase(s8)); // true
        System.out.println(s4.startsWith("Selenium")); // true
        System.out.println(s6.startsWith("Selenium")); // true
        System.out.println(s7.endsWith("Selenium")); // true

        System.out.println(s == s2.intern());

        System.out.println(s5.length());
        System.out.println(s5.trim().length());

    }
}
