package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest {

    @Test
    public void verifyCheckout() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.id("small-searchterms"))
              .sendKeys("Laptop");

        driver.findElement(By.cssSelector("button.search-box-button"))
              .click();

        driver.findElement(By.cssSelector(".product-title a"))
              .click();

        driver.findElement(By.cssSelector("button.add-to-cart-button"))
              .click();

        driver.findElement(By.cssSelector("a.ico-cart"))
              .click();

        driver.findElement(By.id("termsofservice"))
              .click();

        driver.findElement(By.id("checkout"))
              .click();

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("Login") ||
                          title.contains("Checkout"));

        System.out.println("Checkout Page Verified");

        driver.quit();
    }
}
