package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseSTT {
    public WebDriver driver;

    @BeforeSuite
    public void initializeDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void killSession(){
        driver.quit();
    }

    @BeforeTest
    public void launchApplication(){
        driver.get("https://www.saucedemo.com/");
    }
}
