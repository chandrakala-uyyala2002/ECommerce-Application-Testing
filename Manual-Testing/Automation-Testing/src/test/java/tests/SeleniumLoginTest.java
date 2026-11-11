package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumLoginTest {

    @Test
    public void verifyLoginPage() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        System.out.println("Login Page Title: " + driver.getTitle());

        driver.quit();
    }
}
