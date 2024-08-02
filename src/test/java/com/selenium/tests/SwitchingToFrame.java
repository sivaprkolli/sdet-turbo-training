package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SwitchingToFrame {
    WebDriver driver;


    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void switchToFrames() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://yopmail.com/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement emailInputBox = driver.findElement(By.cssSelector(".ycptinput"));

        emailInputBox.sendKeys("siva");

        WebElement emailSubmitButton = driver.findElement(By.cssSelector("div[id='refreshbut'] button.md > i"));
        emailSubmitButton.click();

        driver.switchTo().frame("ifinbox");
        driver.findElement(By.xpath("(//span[contains(text(),'finmeadows')])[1]")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        driver.switchTo().frame("ifmail");
        boolean b = driver.findElement(By.xpath("//span[.='TechFini']")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(driver.findElement(By.xpath("//span[.='TechFini']")).isDisplayed());
    }
}
