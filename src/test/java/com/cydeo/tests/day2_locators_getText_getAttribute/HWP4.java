package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4 {

    public static void main(String[] args) throws InterruptedException {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a Chrome browser
        //PS: Locate “Home” link using “className” locator
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        Thread.sleep(2000);
        homeLink.click();


        //4- Verify title is as expected:
        //Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }
    }
}
