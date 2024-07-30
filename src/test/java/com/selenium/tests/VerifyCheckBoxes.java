package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyCheckBoxes {
    WebDriver driver;
    SoftAssert softAssert;

    @BeforeTest
    public void launchBrowser(){
        driver = new ChromeDriver();
        softAssert = new SoftAssert();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void verifyCheckBox() throws InterruptedException {

        WebElement checkBox1 = driver.findElement(By.cssSelector("[type='checkbox']:nth-of-type(1)"));
        checkBox1.click();

        WebElement checkBox2 = driver.findElement(By.cssSelector("[type='checkbox']:nth-of-type(2)"));
        checkBox2.click();

        System.out.println(checkBox1.isSelected());
        System.out.println(checkBox2.isSelected());

        softAssert.assertAll();

    }

    @AfterMethod
    public void killSession(){
        driver.quit();
    }
}
