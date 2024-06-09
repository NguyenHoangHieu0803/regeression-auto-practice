package pages;

import org.openqa.selenium.By;

import static common.Browser.getDriver;

public class LoginPage {

    public static void loginUsingStandardUser () {
        getDriver().findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("standard_user");
        getDriver().findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");

        getDriver().findElement(By.xpath("//input[@type=\"submit\"]")).click();
    }

}
