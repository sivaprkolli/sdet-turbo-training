package com.stt.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteStringsFromList {
    public static void main(String[] args) {

        List<String> users = Arrays.asList("Auto123","Auto456", "Auto987", "Test123","Test1245", "Test9878");
        List<String> actualUsers = new ArrayList<>();

        for(int i=0; i< users.size(); i++){
            if (users.get(i).contains("Auto")){

            }else {
                actualUsers.add(users.get(i));
            }

        }

        System.out.println(actualUsers);
    }
}
