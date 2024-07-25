package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
    WebDriver driver;
    SoftAssert softAssert;

    @BeforeTest
    public void launchBrowser(){
        driver = new ChromeDriver();
        softAssert = new SoftAssert();
    }

    @Test
    public void login() throws InterruptedException {


        driver.get("https://www.saucedemo.com/");

        WebElement userNameInputBox = driver.findElement(By.id("user-name"));
        WebElement passInputBox =  driver.findElement(By.name("password"));
        WebElement submitButton = driver.findElement(By.className("submit-button"));
        WebElement passwordData = driver.findElement(By.className("login_password"));
        System.out.println(passwordData.getText());
        userNameInputBox.sendKeys("standard_user");
        String[] password = passwordData.getText().split(":");

        passInputBox.sendKeys("Test");
        submitButton.click();

        WebElement userNames = driver.findElement(By.id("login_credentials"));
        System.out.println(userNames.getText());

        WebElement errorMessage = driver.findElement(By.xpath("//div/h3"));
        System.out.println(errorMessage.getText());
        softAssert.assertEquals(errorMessage.getText(), "Epic :(: Username and password do not match any user in this service", "Both vales are not matched please check !!!");

        passInputBox.clear();
        passInputBox.sendKeys(password[1].trim());
        submitButton.click();
        Thread.sleep(6000);

        softAssert.assertAll();

    }

    @AfterMethod
    public void killSession(){
        driver.quit();
    }
}
