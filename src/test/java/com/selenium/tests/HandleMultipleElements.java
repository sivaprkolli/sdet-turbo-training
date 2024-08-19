package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HandleMultipleElements {

    WebDriver driver;

    @Test
    public void verifyFindElementsVsFindElement(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> allLinks = driver.findElements(By.cssSelector("ul > li > a11"));
        System.out.println(allLinks);
        System.out.println(allLinks.size());

        WebElement abTestLink = driver.findElement(By.cssSelector("[href='/abtest11']"));
        abTestLink.click();
    }

    @Test
    public void verifyMultipleElements() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.cssSelector("[onclick='addElement()']"));

        for(int i=0; i<5; i++){
            addElementButton.click();
            Thread.sleep(500);
        }

        List<WebElement> deleteButtons = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        System.out.println(deleteButtons);
        System.out.println(deleteButtons.size());

        Assert.assertEquals(deleteButtons.size(), 5);

        for (int j=0; j<deleteButtons.size(); j++){
            deleteButtons.get(j).click();
            Thread.sleep(500);
        }
        List<WebElement> deleteButtons1 = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));

        System.out.println(deleteButtons1);

        Assert.assertEquals(deleteButtons1.size(), 0);
    }

    @AfterMethod
    public void killDriver(){
        driver.quit();
    }
}
