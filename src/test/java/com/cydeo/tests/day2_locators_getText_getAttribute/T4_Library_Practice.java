package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library_Practice {
    public static void main(String[] args) {

        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        //Locate username input box using : classname locator
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        //Locate password input box using : id locator
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("anything");

        //5. Verify: visually “Sorry, Wrong Email or Password” displayed
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        //6.Locate Sign in button using : tagName locator
        //verified

    }
}
