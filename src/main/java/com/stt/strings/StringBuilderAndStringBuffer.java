package com.stt.strings;

public class StringBuilderAndStringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Playwright");
        sb.append(" Automation");
        System.out.println(sb);
       // System.out.println(sb.reverse());


        StringBuilder ssb = new StringBuilder("Playwright Automation");

        System.out.println(sb.equals(ssb));


    }
}
