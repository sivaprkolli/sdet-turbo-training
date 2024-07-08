package com.stt.strings;

public class Basics {
    public static void main(String[] args) {
        int version = 4;
        String name = "Selenium";
        String tool = new String("Playwright");

        name.concat(" Automation");
        System.out.println(name);

        System.out.println( name + " Automation");

        System.out.println("name :: " + name);
        name = name + " Testing";
        System.out.println(name);

        String name1 = name.concat(" Automation");
        System.out.println("name1 :: " + name1);

        verifyTextPresent("Apple", 12);
        verifyTextPresent("Samsung", 20);
    }

    public static void verifyTextPresent(String name, int percentage){
        System.out.println("I purchased mobile from apple.com and I got discount of 12");
        System.out.println("I purchased mobile from " + name + " and I got discount of " + percentage);
    }
}
