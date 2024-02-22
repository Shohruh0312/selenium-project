package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_StaleElementReferenceException {
    public static void main(String[] args) throws InterruptedException {
        //TC #4: StaleElementReferenceException Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement CydeoLink = driver.findElement(By.xpath("//a[@target='_blank']"));

        System.out.println("Before refresh CydeoLink.isDisplayed() = " + CydeoLink.isDisplayed());
        //4- Refresh the page.
        driver.navigate().refresh();

        //5- Verify it is displayed, again.

         CydeoLink = driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("CydeoLink.getText() = " + CydeoLink.getText());
        System.out.println("After refresh CydeoLink.isDisplayed() = " + CydeoLink.isDisplayed());
        //This is a simple StaleElementReferenceException to understand what is
        //this exception and how to handle it.
        Thread.sleep(2000);
        driver.quit();
    }
}
