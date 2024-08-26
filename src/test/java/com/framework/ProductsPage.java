package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    By products= By.cssSelector(".inventory_item_name ");

    public int getNumberOfProducts(){
        return driver.findElements(products).size();
    }
}
