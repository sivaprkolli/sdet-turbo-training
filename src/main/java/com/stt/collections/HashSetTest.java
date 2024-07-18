package com.stt.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
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
       // System.out.println(hashSet.get(0));
       // System.out.println(hashSet.indexOf(0));
        for(Object test: hashSet){
            System.out.println(test);
        }
        System.out.println("***********************");


        ArrayList arrayList1 = new ArrayList<Integer>();
        arrayList1.add("Selenium");
        arrayList1.add(4.0);
        arrayList1.add(true);
        arrayList1.add('c');
        arrayList1.add(4.0f);
        arrayList1.add("Selenium");
        arrayList1.add(null);
        arrayList1.add(null);
        System.out.println(arrayList1.get(5)); // read using index
        System.out.println(arrayList1.get(1)); // read using index
        System.out.println(arrayList1.indexOf(4.0)); // get index

        System.out.println(arrayList1);

    }
}
