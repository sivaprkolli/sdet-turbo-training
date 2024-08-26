package com.framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseSTT{

    @Test
    public void verifyLoginSuccess(){
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(productsPage.getNumberOfProducts(), 6);
    }
}
