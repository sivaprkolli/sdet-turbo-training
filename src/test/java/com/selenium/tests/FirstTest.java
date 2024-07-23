package com.selenium.tests;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirstTest {


    @Test
    public void openApplication() throws InterruptedException {
        //Ancestor/Parent objectRef = new Child();
       // ChromeDriver webDriver1 = new ChromeDriver();
       // ChromiumDriver webDriver = new ChromeDriver();
       // RemoteWebDriver webDriver = new ChromeDriver();
        //WebDriver webDriver = new ChromeDriver();
        //SearchContext webDriver = new ChromeDriver();

        WebDriver driver = new ChromeDriver(); // open browser
        driver.get("https://the-internet.herokuapp.com/");// launch application

        driver.navigate().to("https://para.testar.org/"); // differnce btw get/to
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.quit();
    }
}
