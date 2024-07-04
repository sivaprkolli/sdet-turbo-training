package com.stt.introSession;

public class SwitchCondition {
    static String day = "Saturday";

    public static void main(String[] args) {
        switch (day){
            case "Monday":
                System.out.println("Office open: Monday");
                break;
            case "Tuesday":
                System.out.println("Office open: Tuesday");
                break;
            case "Sunday":
                System.out.println("Office close: Sunday");
                break;
            default:
                System.out.println("Provide right day");
        }
    }
}
