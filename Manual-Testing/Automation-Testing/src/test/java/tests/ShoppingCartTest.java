package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest {

    @Test
    public void verifyShoppingCart() {

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

        String cartTitle = driver.getTitle();

        Assert.assertTrue(cartTitle.contains("Cart"));

        System.out.println("Shopping Cart Test Passed");

        driver.quit();
    }
}
