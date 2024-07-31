package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleDropdowns extends BaseTest{

    @Test
    public void verifyDropdown(){
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");

        WebElement jobTitleDropdown = driver.findElement(By.cssSelector("select[id^='UserTitle']"));

        Select roleSelect = new Select(jobTitleDropdown);

        String initialDropdownValue = roleSelect.getFirstSelectedOption().getText();
        System.out.println("initialDropdownValue :: "  + initialDropdownValue);

        roleSelect.selectByValue("Operations_Manager_AP");

        String afterDropdownValue = roleSelect.getFirstSelectedOption().getText();
        System.out.println("afterDropdownValue :: "  + afterDropdownValue);

        List<WebElement> roleSelectOptions = roleSelect.getOptions();
        List<String> actualOptions = new ArrayList<>();

        for (int i=0; i<roleSelectOptions.size(); i++)
        {

            String text = roleSelectOptions.get(i).getText();
            actualOptions.add(text);
        }
        System.out.println(actualOptions);

    }
}
