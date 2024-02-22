package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Hw1 {
    public static void main(String[] args) {

        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeText = driver.findElement(By.xpath("//a[@href='/']"));

        //b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.tagName("h2"));

        //c. “E-mail” text
        WebElement email = driver.findElement(By.xpath("//label[.='E-mail']"));

        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[contains(@pattern,'[a-z0-9.')]"));

        //e. “Retrieve password” button
        WebElement retrieve = driver.findElement(By.xpath("//i[.='Retrieve password']"));

        //f. “Powered by Cydeo text
        WebElement poweredCydeo = driver.findElement(By.xpath("//a[.='CYDEO']"));

        //4. Verify all web elements are displayed.

        System.out.println("homeText.isDisplayed() = " + homeText.isDisplayed());
        System.out.println("forgotPassword.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrieve.isDisplayed() = " + retrieve.isDisplayed());
        System.out.println("poweredCydeo.isDisplayed() = " + poweredCydeo.isDisplayed());
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }
}
