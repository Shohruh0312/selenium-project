package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_cssSelector {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

       // WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));
       // WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        WebElement logInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        logInButton.getText();

        String expectedLogIn = "Log In";
        String actualLogIn = logInButton.getAttribute("value");

        if (actualLogIn.equals(expectedLogIn)) {
            System.out.println("Log In button is PASSED");
        }else {
            System.out.println("Log In button is FAILED");

        }
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}
