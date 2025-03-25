package com.stt.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseSTT {

    WebDriver driver;

    @BeforeSuite
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeTest
    public void launchApplication(){
        driver.get("https://www.saucedemo.com/");
    }

    @AfterSuite
    public void killSession(){
        driver.quit();
    }
}
