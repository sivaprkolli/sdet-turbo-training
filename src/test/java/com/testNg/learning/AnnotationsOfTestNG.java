package com.testNg.learning;

import org.testng.annotations.*;

public class AnnotationsOfTestNG {

    /**
     * @BeforeSuite - Intializations
     * @BeforeTest -
     * @BeforeClass -
     * @BeforeMethod -
     * @Test
     */

    @Test
    public void simpleTest(){
        System.out.println("simple test");
    }

    @BeforeSuite
    public void beforeSuite(){
        //DB connecting
        //Report Initialization
        //Drivers Initialization
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest(){
        // Launch Application
        // before all the classes
        System.out.println("Before Test");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }


    @BeforeClass
    public void beforeClass(){
        // before every class
        System.out.println("Before Class");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }


    @BeforeMethod
    public void beforeMethod(){
        //Every Testcase
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

}
