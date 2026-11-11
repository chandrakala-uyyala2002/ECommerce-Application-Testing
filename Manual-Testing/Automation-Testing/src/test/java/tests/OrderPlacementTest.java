package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderPlacementTest {

    @Test
    public void verifyOrderPlacement() {

        WebDriver driver = new ChromeDriver();

        try {
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

            Assert.assertTrue(
                driver.getCurrentUrl().contains("login"),
                "User should be redirected to login before checkout"
            );

            System.out.println("Checkout Login Verification Passed");

        } finally {
            driver.quit();
        }
    }
}
