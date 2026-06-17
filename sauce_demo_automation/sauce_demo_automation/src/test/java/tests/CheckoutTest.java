package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class CheckoutTest extends BaseTest {

	@Test
    public void verifySuccessfulCheckout() {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));

        Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Bike Light"));

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Aasika");

        driver.findElement(By.id("last-name")).sendKeys("G");

        driver.findElement(By.id("postal-code")).sendKeys("600001");

        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("finish")).click();

        String successMessage =driver.findElement(By.className("complete-header")).getText();

        Assert.assertEquals(successMessage,"Thank you for your order!");
    }
}
