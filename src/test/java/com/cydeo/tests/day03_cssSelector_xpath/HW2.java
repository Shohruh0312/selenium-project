package com.cydeo.tests.day03_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = new ChromeDriver();

       // WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeText = driver.findElement(By.cssSelector("label[for='USER_REMEMBER']"));
        rememberMeText.getText();


        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement expectedFPText = driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']"));
        expectedFPText.getText();

        String actualFPText =  driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']")).getText();

       // System.out.println("expectedFPText = " + expectedFPText);

        if (actualFPText.equals("FORGOT YOUR PASSWORD?")){
            System.out.println("Forgot your password? is PASSED");
        }else {
            System.out.println("Forgot your password? is FAILED");
            System.out.println("actualFPText = " + actualFPText);
            System.out.println("expectedFPText = " + expectedFPText);
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
    }
}
