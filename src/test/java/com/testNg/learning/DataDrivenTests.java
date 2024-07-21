package com.testNg.learning;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenTests {

    @Parameters({"url"})
    @BeforeSuite
    public void initializeDrivers(String baseURL){
        System.out.println(baseURL);
    }

    @Parameters({"userName", "password"})
    @BeforeTest
    public void launchApplication(String un, String pwd){
       System.out.println(un + "::" + pwd);
    }

    @Test
    public void verifyLogin(){

        System.out.println("Login Success");
    }

}
