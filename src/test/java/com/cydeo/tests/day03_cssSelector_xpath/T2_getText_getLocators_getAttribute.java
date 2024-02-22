package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getLocators_getAttribute {

    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String expectedRememberMe = "Remember me on this computer";
        String actualRememberMe = driver.findElement(By.className("login-item-checkbox-label")).getText();

        if (actualRememberMe.equals(expectedRememberMe)){
            System.out.println("Label text PASSED!");
        }else {
            System.out.println("Label text FAILED!");

        }
        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        String expectedPasswordText = "FORGOT YOUR PASSWORD?";
        String actualPasswordText = driver.findElement(By.className("login-link-forgot-pass")).getText();

        if (actualPasswordText.equals(expectedPasswordText)) {
            System.out.println("Password text verification PASSED");

        }else {
            System.out.println("actualPasswordText = " + actualPasswordText);
            System.out.println("expectedPasswordText = " + expectedPasswordText);
            System.out.println("Password text verification FAILED");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedHrefValue = "forgot_password=yes";
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualHrefValue = forgotPasswordLink.getAttribute("href");

        if (actualHrefValue.contains(expectedHrefValue)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        //PS: Inspect and decide which locator you should be using to locate web
        //elements
    }
}
