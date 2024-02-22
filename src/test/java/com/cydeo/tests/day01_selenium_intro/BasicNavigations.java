package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        //go to tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        System.out.println("driver.getTitle() = " + driver.getTitle());


        //use navigate back() to go back
        driver.navigate().back();

        Thread.sleep(1000);

        //user navigate forward () to go forward
        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // String currentTitle = driver.getTitle();
        //System.out.println("currentTitle = " + currentTitle);

        //closes only currently focused window/tab
        driver.close();

        //closing all the opened browsers
        driver.quit();


    }
}
