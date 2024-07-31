package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    @BeforeTest
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }
}
