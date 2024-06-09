package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    //login sucessfully with standard user https://www.saucedemo.com/

    @Test
    void loginSuccessStandardUser () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"));
    }
}
