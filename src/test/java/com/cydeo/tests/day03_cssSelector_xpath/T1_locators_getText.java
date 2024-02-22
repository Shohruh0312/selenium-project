package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
//WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement usernameBox = driver.findElement(By.className("login-inp"));
        usernameBox.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys("incorrect");

        //5- Click to the login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        Thread.sleep(3000);
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement warning = driver.findElement(By.className("errortext"));
        warning.getText();

        String expectedWarning = "Incorrect login or password";
        String actualWarning = warning.getText();

        if (actualWarning.equals(expectedWarning)) {
            System.out.println("Warning message is as expected");
        } else {
            System.out.println("Warning message is failed");

            //PS: Inspect and decide which locator you should be using to locate web
            //elements.
        }
    }
}