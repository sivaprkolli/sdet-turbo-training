package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumActions {
    WebDriver driver;

    public SeleniumActions(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public void typeValue(By by, String data){
        driver.findElement(by).sendKeys(data);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void typeValue(WebElement element, String data){
        element.sendKeys(data);
    }

    public int getNumberOfElements(By by){
        return driver.findElements(by).size();
    }

    public int getNumberOfElements(List<WebElement> elements){
        return elements.size();
    }

}
