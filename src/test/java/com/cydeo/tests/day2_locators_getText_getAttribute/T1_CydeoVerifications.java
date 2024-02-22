package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

//TC #1: Cydeo practice tool verifications
//1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to(" https://practice.cydeo.com");
//3. Verify URL contains
//Expected: cydeo

        String expectedInUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification is PASSED");
        }else {
            System.out.println("URL verification is FAILED");
        }


//4. Verify title:
// Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED");
        }else {
            System.out.println("Title verification is FAILED");
        }
        driver.close();
    }
}
