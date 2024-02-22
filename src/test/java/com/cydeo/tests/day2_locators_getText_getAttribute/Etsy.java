package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) {

        //HWP #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");


        //3. Search for “wooden spoon”
        WebElement googleSearchBox = driver.findElement(By.id("global-enhancements-search-query"));
        googleSearchBox.sendKeys("wooden spoon" + Keys.ENTER);


        //4. Verify title:
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();
        //Expected: “Wooden spoon - Etsy”
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verified");
        }else {
            System.out.println("Title failed");
        }
        driver.close();
    }
}
