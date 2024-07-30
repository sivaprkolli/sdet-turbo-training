package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicallyChangingValueAndAssert {

    WebDriver driver;

    @Test
    public void handleDynamicValue(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement abTestLink = driver.findElement(By.cssSelector("[href*='abtest']"));
        abTestLink.click();

        //Not good practice
//        WebElement heading1 = driver.findElement(By.xpath("//h3[text()='A/B Test Variation 1']"));
//        Assert.assertTrue(heading1.isDisplayed());

        WebElement heading2 = driver.findElement(By.tagName("h3"));
        Assert.assertEquals(heading2.getText(), "A/B Test Control");

        WebElement selenium = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(selenium.isDisplayed());

        WebElement logo = driver.findElement(By.cssSelector("[alt='Fork me on GitHub']"));
        Assert.assertTrue(logo.isDisplayed());
    }
}
