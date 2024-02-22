package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {

        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        WebElement headerText = driver.findElement(By.tagName("h3"));
        //Expected: “Log in to ZeroBank”

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();



        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header verify text PASSED!");
        }else {
            System.out.println("Header verify text FAILED!");
        }
    }
}
