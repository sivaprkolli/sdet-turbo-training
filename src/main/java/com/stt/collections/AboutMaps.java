package com.stt.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AboutMaps {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("Selenium", 4.0);
        hashMap.put("Appium", 2.0);
        hashMap.put("WebDriverIO", 7.0);
        hashMap.put("Playwright", 1.0);
        hashMap.put("Playwright", 1.0);
        hashMap.put("RestAssured", null);
        hashMap.put("Postman", null);
        hashMap.put(null, 4.0);
        hashMap.put(null, 2.0);

        System.out.println(hashMap);
        System.out.println(hashMap.get("Appium"));
        System.out.println(hashMap.containsKey("Siva"));
        System.out.println(hashMap.containsValue("Siva"));


        Map<String, Double> treeMap = new TreeMap();
        treeMap.put("Selenium", 4.0);
        treeMap.put("Appium", 2.0);
        treeMap.put("WebDriverIO", 7.0);
        treeMap.put("Playwright", 1.0);
        treeMap.put("Playwright", 1.0);
        treeMap.put("RestAssured", null);
        treeMap.put("Postman", null);
//        treeMap.put(null, 4.0);
//        treeMap.put(null, 2.0);

        System.out.println(treeMap);

        for (Map.Entry map:treeMap.entrySet()){
            System.out.println(map.getKey() + " ::" + map.getValue());
        }


        System.out.println("*******************************************");
        Iterator iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println(entry);

        }


    }
}
