package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import stepDefs.D01_registerStepDef;

import java.awt.*;
import java.awt.image.ColorConvertOp;

public class D02_loginStepDef {
    public static ChromeDriver driver;
    P02_login loginLocators = new P02_login();
//    p01_register registerLocator =new p01_register();

    @Given("user go to login page")
    public void user_go_to_login_page(){
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //click on login button
       loginLocators.Login().click();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {
       loginLocators.email().sendKeys(arg0);
        loginLocators.password().sendKeys(arg1);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        loginLocators.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert Assert= new SoftAssert();
        Assert.assertTrue(loginLocators.successfulLogin1().isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Assert.assertAll();
        driver.quit();
    }

    @When("user login with {string} and {string}")
    public void userLoginWithAnd(String arg0, String arg1) {
        loginLocators.email().sendKeys(arg0);
        loginLocators.password().sendKeys(arg1);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert Assert = new SoftAssert();
        Assert.assertTrue(loginLocators.invalidLogin().isDisplayed());
        Assert.assertEquals(String.valueOf(loginLocators.invalidLogin().getCssValue("color")), Color.fromString("#e4434b").asRgba());
        Assert.assertAll();
        driver.quit();
    }



}
