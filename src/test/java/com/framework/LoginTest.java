package com.framework;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseSTT {
    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeClass
    public void initializePages() {
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @Test
    public void verifyLoginSuccess() {
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(productsPage.getNumberOfProducts(), 6);
    }
}
