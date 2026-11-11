package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetailsTest {

    @Test
    public void verifyProductDetails() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.id("small-searchterms"))
              .sendKeys("Laptop");

        driver.findElement(By.cssSelector("button.search-box-button"))
              .click();

        driver.findElement(By.cssSelector(".product-title a"))
              .click();

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("Laptop"));

        System.out.println("Product Details Test Passed");

        driver.quit();
    }
}
