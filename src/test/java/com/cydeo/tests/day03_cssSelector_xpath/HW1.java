package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW1{
    public static void main(String[] args) throws InterruptedException {

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement boxUsername = driver.findElement(By.cssSelector("input[class='login-inp']"));
        boxUsername.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement boxPassword = driver.findElement(By.cssSelector("input[type='password']"));
        boxPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginBox = driver.findElement(By.cssSelector("input[value='Log In']"));
        Thread.sleep(1000);
        loginBox.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

        WebElement errorText = driver.findElement(By.cssSelector("div[class='errortext']"));
        String expectedErrorText = "Incorrect login or password";
        String actualErrorText = errorText.getText();


         if (actualErrorText.equals(expectedErrorText)){
             System.out.println("Error text verification PASSED");
         }else {

             System.out.println("Error text verification FAILED");
         }
    }
}
