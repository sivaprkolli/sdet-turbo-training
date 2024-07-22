package com.testNg.learning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "automation")
    public Object[][] automationTool(){
        return new Object[][]{
                {"Selenium", 4.0, 2010},
                {"Appium", 2.0, 2013},
                {"Playwright", 1.0, 2020}
        };
    }

    @DataProvider(name = "login")
    public Object[][] loginData(){
        return new Object[][]{
                {"User1", "Password1"},
                {"User2", "Password2"},
                {"User3", "Password3"},
                {"User4", "Password4"},
                {"User5", "Password5"},
                {"User6", "Password6"},

        };
    }


    @Test(dataProvider = "automation")
    public void readTools(String automationToolName, double version, int year){
        System.out.println(automationToolName);
        System.out.println(version);
        System.out.println(year);
    }

    @Test(dataProvider = "login")
    public void verifyLoginSuccess(String username, String password){
        System.out.println(username + " :: " + password);
    }
}
