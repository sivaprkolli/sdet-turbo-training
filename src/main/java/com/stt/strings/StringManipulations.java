package com.stt.strings;

public class StringManipulations {
    public static void main(String[] args) {

        String s = "@#$%^&*34567890trdtfgahvbjnkjlljhgfdgDGAFSGDHJKFLSDHG";
        String s1 = "Successfully paid $2000 to the Vodafone";

        int index = s1.indexOf("$");
        System.out.println(index);
        String partialMessage = s1.substring(index);
        System.out.println(partialMessage);
        int index2 = partialMessage.indexOf(" to");
        System.out.println(index2);
        String actualString = partialMessage.substring(0, index2);
        System.out.println(actualString);

        System.out.println("****************************");

        System.out.println(s.substring(7, 15));
        System.out.println(s.replaceAll("[^0-9]", ""));
        System.out.println(s.replaceAll("[^a-z]", ""));
        System.out.println(s.replaceAll("[^A-Z]", ""));
        System.out.println(s.replaceAll("[^a-zA-Z]", ""));
        System.out.println(s.replaceAll("[0-9a-zA-Z]", ""));




    }
}
