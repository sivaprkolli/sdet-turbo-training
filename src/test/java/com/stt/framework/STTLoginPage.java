package com.stt.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class STTLoginPage {

    WebDriver driver;

    public STTLoginPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    By usernameInputBox = By.id("user-name");
    By passwordInputBox = By.name("password");
    By loginButton = By.cssSelector(".submit-button.btn_action");

    public void login(String un, String pwd){
        driver.findElement(usernameInputBox).sendKeys(un);
        driver.findElement(passwordInputBox).sendKeys(pwd);
        driver.findElement(loginButton).click();
    }
}
