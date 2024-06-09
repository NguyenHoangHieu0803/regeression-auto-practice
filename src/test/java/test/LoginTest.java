package test;

import common.Browser;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

import static common.Browser.getCurrentUrl;
import static common.Browser.getDriver;
import static pages.LoginPage.loginUsingStandardUser;

public class LoginTest {

    LoginPage loginPage;

    @BeforeClass
    void setup(){
        Browser.openBrowser("chrome");
        Browser.visit("https://www.saucedemo.com");
        getDriver().manage().window().maximize();
        loginPage = new LoginPage();
    }

    @Test
    void loginSuccessStandardUser () {
        loginUsingStandardUser();
        Assert.assertTrue(getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"));

    }

//    @Test
//    void loginSuccessOtherUser () {
//
//    }
}
