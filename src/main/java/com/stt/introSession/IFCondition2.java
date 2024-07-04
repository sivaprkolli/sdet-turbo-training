package com.stt.introSession;

public class IFCondition2 {
    static int age=60;

    public static void main(String[] args) {
        if(age>18 && age<60){
            System.out.println("eligible to apply driving licence");
        } else if(age == 18 || age < 17){
            System.out.println("wait for a day to apply driving licence");
        }
        else if(age < 18){
            System.out.println("not eligible to apply driving licence");
        } else{
            System.out.println("renew Driving licence");
        }
    }
}
