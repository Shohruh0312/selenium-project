package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtraTask3 {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        //  WebElement gmailButton = driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']"));
        WebElement gmailButton = driver.findElement(By.cssSelector("[aria-label='Gmail (opens a new tab)']"));
        gmailButton.click();

        //4- Verify title contains:
        //Expected: Gmail
        String expectGmail = "Gmail";
        String actualGmail = driver.getTitle();
        if (actualGmail.contains(expectGmail)) {
            System.out.println("Title contains Gmail ");
        } else {
            System.out.println("Title does not contain Gmail ");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title contains GOOGLE");
        } else {
            System.out.println("Title does not contain GOOGLE");
        }
    }
}
