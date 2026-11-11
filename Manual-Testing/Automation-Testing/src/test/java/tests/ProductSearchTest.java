package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearchTest {

    @Test
    public void verifyProductSearch() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.id("small-searchterms"))
              .sendKeys("Laptop");

        driver.findElement(By.cssSelector("button.search-box-button"))
              .click();

        Assert.assertTrue(driver.getTitle().contains("Search"));

        System.out.println("Product Search Test Passed");

        driver.quit();
    }
}
