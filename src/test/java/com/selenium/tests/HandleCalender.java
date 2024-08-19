package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HandleCalender {
    public String testMonth="October 2024";
    public String testDate = "10";
    @Test
    public void selectDates(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> months = driver.findElements(By.cssSelector(".DayPicker-Month > div.DayPicker-Caption > div"));
        List<String> actualMonthAndYear = new ArrayList<>();

        for(int j=0; j<12; j++){ // checking for months

            for(int i=0; i< months.size(); i++){ // checking for current month
                actualMonthAndYear.add(months.get(i).getText());
            }
            System.out.println(actualMonthAndYear);

            if(actualMonthAndYear.contains(testMonth)){

                driver.findElement(By.xpath("//div[contains(text(),'"+testMonth+"')]/../../div[@class='DayPicker-Body']/div/div/div/p[text()='"+testDate+"']")).click();
                break;

            } else{
                driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
            }
        }


    }

}
