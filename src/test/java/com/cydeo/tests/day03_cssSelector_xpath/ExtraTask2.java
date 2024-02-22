package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtraTask2 {
    public static void main(String[] args) {
        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        WebElement header = driver.findElement(By.xpath("//h3"));

        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = header.getText();
        header.click();

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header is correct");
            System.out.println("actualHeader = " + actualHeader);
            System.out.println("expectedHeader = " + expectedHeader);
        } else {
            System.out.println("Header is not correct");
        }
    }
}
