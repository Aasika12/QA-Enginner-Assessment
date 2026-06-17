package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LockedUserTest  extends BaseTest {

    @Test
    public void verifyLockedUserErrorMessage() {

        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        String actualError =driver.findElement(By.cssSelector("h3")).getText();

        Assert.assertEquals(actualError,"Epic sadface: Sorry, this user has been locked out.");
    }

}
