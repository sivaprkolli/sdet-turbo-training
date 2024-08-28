package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage {
    WebDriver driver;
    SeleniumActions seleniumActions;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        seleniumActions = new SeleniumActions(driver);
        PageFactory.initElements(driver, this);
    }

    By products= By.cssSelector(".inventory_item_name ");

    @FindBy(css = ".inventory_item_name ")
    private List<WebElement> productsList;

    public int getNumberOfProducts(){
        return seleniumActions.getNumberOfElements(productsList);
    }


}
