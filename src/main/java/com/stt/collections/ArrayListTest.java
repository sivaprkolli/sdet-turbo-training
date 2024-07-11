package com.stt.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList arrayList1 = new ArrayList<>();
        List<String> list = new ArrayList<String>();

        int[] a = {1,2,3,4,5};
        System.out.println(a.length);
        System.out.println(a[7]);

        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);


        arrayList1.add("Selenium");
        arrayList1.add(4.0);
        arrayList1.add(true);
        arrayList1.add('c');
        arrayList1.add(4.0f);

        System.out.println(arrayList1.get(4));


        arrayList1.add(2, "Appium");
        System.out.println(arrayList1);
        System.out.println(arrayList1.size());

        Iterator iterator = arrayList1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
