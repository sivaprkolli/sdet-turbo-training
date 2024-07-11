package com.stt.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List list = new LinkedList();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Selenium");
        linkedList.add("4.0");
        linkedList.add("true");
        linkedList.add("c");
        linkedList.add("4.0f");

        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        list.add("Selenium");
        list.add(4.0);
        list.add(true);
        list.add('c');
        list.add(4.0f);

        list.add(2, "Appium");

        System.out.println(list);
    }
}
