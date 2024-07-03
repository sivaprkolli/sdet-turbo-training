package com.stt.oops.abstraction2;

public class ExecutionTests extends Implementation2{

    public static void main(String[] args) {

        //WebDriver driver = new ChromeDriver();
        AbstractParentClass abstractParentClass = new ExecutionTests();

        abstractParentClass.login("Test", "Test@123");

        System.out.println(abstractParentClass.getUserName("Selenium"));
       if( abstractParentClass.getUserName("Selenium").equals("Selenium")){
           System.out.println("Test Pass");
       }else{
           System.out.println("Test Fail");
       }
        abstractParentClass.completePayment("152434512674123894");
        System.out.println(abstractParentClass.verifyPayment("Success"));
       if(abstractParentClass.verifyPayment("Success").contains("Success")){
           System.out.println("Test Pass");
       } else{
           System.out.println("Test fail");
       }
    }
}
