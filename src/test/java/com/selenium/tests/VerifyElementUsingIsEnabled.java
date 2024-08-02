package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyElementUsingIsEnabled {
    WebDriver driver;


    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void handleDynamicValue(){
        driver = new ChromeDriver();
        driver.get("https://www.prettylittlething.com/beige-pu-woven-lace-up-espadrille-heeled-wedges.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement selectSizeButton = driver.findElement(By.cssSelector("#add-to-bag-button"));

        System.out.println(selectSizeButton.isDisplayed()); // true
        System.out.println(selectSizeButton.isEnabled()); // false
    }
}
