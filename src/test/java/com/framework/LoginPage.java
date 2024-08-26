package com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    By usernameInput = By.id("user-name");
    By passwordInput = By.id("password");
    By loginButton = By.cssSelector(".submit-button.btn_action");

    public void login(String un, String pwd){
        driver.findElement(usernameInput).sendKeys(un);
        driver.findElement(passwordInput).sendKeys(pwd);
        driver.findElement(loginButton).click();
    }
}
