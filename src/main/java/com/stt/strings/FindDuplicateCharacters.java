package com.stt.strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String tool = "Selenium";

        char chr1 = 'a';
        char[] chr = tool.toCharArray();

        for(int i=0; i<chr.length; i++){
//            System.out.println("i for loop");
//            System.out.println(chr[i]);

            for(int j=i+1; j<chr.length; j++){
                if(chr[i] == chr[j]){
                    System.out.println(chr[i]);
                }
            }
        }


        // Using Map
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char c: chr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        System.out.println(map);
    }
}
