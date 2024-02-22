package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T2_findElements {
    public static void main(String[] args) {
        //TC #2: FindElements Task
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement> links = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("links.size() = " + links.size());

        //5- Print out the texts of the links.
       // WebElement linkText = links.getT

        for (WebElement  each : links){
            System.out.println("Text of Links = " + each.getText());
            System.out.println("HREF attribute values = " + each.getAttribute("href"));
        }
        //6- Print out the HREF attribute values of the links
    }
}
