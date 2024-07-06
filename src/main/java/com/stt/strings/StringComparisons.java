package com.stt.strings;

public class StringComparisons {

    public static void main(String[] args) {
        String automationTool = "Selenium";
        String testingTool = "Selenium";

        String atool = new String("Selenium");

        String webAutomationTool = new String("Playwright");
        String webAutomationLatestTool = new String("Playwright");



        if(automationTool == webAutomationTool){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        System.out.println("Equals method");
        System.out.println("****************************************************");

        if(automationTool.equals(atool)){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        System.out.println("== operator");
        System.out.println("****************************************************");

        if(automationTool == testingTool){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        System.out.println("== operator");
        System.out.println("****************************************************");

        if(webAutomationLatestTool == webAutomationTool){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        System.out.println("equals method");
        System.out.println("****************************************************");

        if(webAutomationLatestTool.equals(webAutomationTool)){
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }
}
