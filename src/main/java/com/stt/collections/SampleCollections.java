package com.stt.collections;

import java.util.*;

public class SampleCollections {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Iterable iterable = new ArrayList();
        //Better way to use
        List list = new ArrayList<>();
        list.add("Selenium");
        list.add(4);
        list.add("Playwright");
        list.add("1");
        list.add(true);
        list.add(12.89);
        list.add('W');

        //System.out.println(list);
        System.out.println(list.get(6));
        list.remove(true);

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("**********************************************");

        for(Object list1: list){
            System.out.println(list1);
        }

        System.out.println("**********************************************");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
