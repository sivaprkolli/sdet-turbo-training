package com.stt.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        Set<String> set = new TreeSet();

        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);

        System.out.println(treeSet);

        set.add("Selenium");
        set.add("Selenium");
        set.add("4.0");
        set.add("true");
        set.add("c");
        set.add("4.0f");


        System.out.println(set);


        Set hashSet = new HashSet<>();
        hashSet.add("Selenium");
        hashSet.add("4.0");
        hashSet.add("true");
        hashSet.add("c");
        hashSet.add("4.0f");
        hashSet.add("Selenium");
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);
    }
}
