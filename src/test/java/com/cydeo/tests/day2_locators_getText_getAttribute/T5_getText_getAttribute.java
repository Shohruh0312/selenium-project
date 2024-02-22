package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration");
        //3- Verify header text is as expected:
        //Expected: Registration form
        WebElement header = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = header.getText();

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification passed");
        }
        //4- Locate “First name” input box
        WebElement firstNameInput = driver.findElement(By.className("form-control"));

        //5- Verify placeholder attribute’s value is as expected: first name
        String expectedPlaceholder = "first name";
        String actualPlaceholder = firstNameInput.getAttribute("placeholder");

        System.out.println("actualPlaceholder = " + actualPlaceholder);

        if (actualPlaceholder.equals(expectedPlaceholder)){
            System.out.println("placeholder attribute verification PASSED");
        }else {
            System.out.println("placeholder attribute verification FAILED");
        }
    }
}
