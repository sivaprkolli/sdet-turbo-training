package com.testNg.learning;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertions {
    public SoftAssert softAssert;

    @BeforeTest
    public void initialize(){
        softAssert = new SoftAssert();
    }

    @Test
    public void test1(){
        System.out.println("Test Case 1");
        Assert.assertTrue(true);
        System.out.println("Test Case 1");
        System.out.println("Test Case 1");
        System.out.println("Test Case 1");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        System.out.println("Test Case 2");
        softAssert.assertTrue(false);
        System.out.println("Test Case 2");
        System.out.println("Test Case 2");
        System.out.println("Test Case 2");
        softAssert.assertEquals(1,1);
        softAssert.assertAll();
    }

    @Test
    public void test3(){
        System.out.println("Test Case 3");
        System.out.println("Test Case 3");
        System.out.println("Test Case 3");
        System.out.println("Test Case 3");
        Assert.assertEquals("Selenium", "selenium");
        //softAssert.assertEquals(1,1);
        //softAssert.assertAll();
    }

    @AfterMethod
    public void verifyAssert(){

    }
}
