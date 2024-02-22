package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        loginButton.getText();

        String expectedLogin = "Log In";

        WebElement actualLogin = driver.findElement(By.cssSelector("input[value='Log In']"));
        actualLogin.getText();

        if (expectedLogin.equals(actualLogin)){
            System.out.println("Log In is as expected ");
            System.out.println("actualLogin = " + actualLogin);
        }else {
            System.out.println("Log In is failed ");
            System.out.println("actualLogin = " + actualLogin);
            System.out.println("expectedLogin = " + expectedLogin);
        }
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
