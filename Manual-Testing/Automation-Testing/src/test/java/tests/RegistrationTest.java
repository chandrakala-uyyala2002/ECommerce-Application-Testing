package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest {

    @Test
    public void verifyRegistrationPage() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");

        String pageTitle = driver.getTitle();

        Assert.assertTrue(pageTitle.contains("nopCommerce"));

        System.out.println("Registration Page Verified");

        driver.quit();
    }
}
