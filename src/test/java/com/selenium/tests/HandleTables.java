package com.selenium.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandleTables {

    WebDriver driver;
    String testData = "Email";

    @Test
    public void verifyFirstRowData(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td[not(a)]"));
        List<String> firstRowActualData = new ArrayList<>();

        System.out.println(firstRow.size());
        for(int i=0; i< firstRow.size(); i++){
            firstRowActualData.add(firstRow.get(i).getText());
        }

        System.out.println("********************firstRowActualData*******************");
        System.out.println(firstRowActualData);

        List<String> firstRowExpectedData = Arrays.asList("Smith", "John", "jsmith@gmail.com", "$50.00", "http://www.jsmith.com");


        Assert.assertEquals(firstRowActualData, firstRowExpectedData);

        driver.quit();
    }

    @Test
    public void verifyFirstRecordInTheTable(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> columnHeaders = driver.findElements(By.xpath("//table[@id='table1']/descendant::span"));
        List<String> headerRowActualData = new ArrayList<>();

        System.out.println(columnHeaders.size());
        for(int i=0; i< columnHeaders.size(); i++){
            headerRowActualData.add(columnHeaders.get(i).getText());
        }

        System.out.println("********************headerRwoActualData*******************");
        System.out.println("headerRowActualData " +  " :: " +  headerRowActualData);

        String lastNameHeaderValue = headerRowActualData.get(0);
        int indexOfHeaderName = headerRowActualData.indexOf(testData) + 1;

        WebElement firstRecord = driver.findElement(
                By.xpath("//table[@id='table1']/descendant::span[text()='"+testData+"']/ancestor::table/tbody/tr[1]/td["+indexOfHeaderName+"]")

        );

        System.out.println(firstRecord.getText());

        driver.quit();
    }
}
