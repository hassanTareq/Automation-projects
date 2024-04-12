package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.p01_register;

public class D01_registerStepDef {
     public static ChromeDriver driver;
    p01_register registerLocator =new p01_register();
    @Given("user open website")
    public void user_open_website(){
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user go to register page")
    public void userGoToRegisterPage() {
       registerLocator.registerPage().click();
    }

    @And("user select gender type")
    public void userSelectGenderType() {
        registerLocator.selectGender().click();
    }

    @And("user enter first name and last name")
    public void userEnterFirstNameAndLastName() {
       registerLocator.FirstName().sendKeys("automation1");
       registerLocator.LastName().sendKeys("tester1");
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select day = new Select(registerLocator.Day());
        day.selectByValue("11");
        Select month = new Select(registerLocator.Month());
        month.selectByValue("5");
        Select year = new Select(registerLocator.Year());
        year.selectByValue("1915");
    }

    @And("user enter email field")
    public void userEnterEmailField() {
        registerLocator.Email().sendKeys("test10@example.com");
    }

    @And("user fills Password fields")
    public void userFillsPasswordFields() {
        registerLocator.password().sendKeys("P@ssw0rd3");
        registerLocator.confirmPassword().sendKeys("P@ssw0rd3");
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
       registerLocator.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert Assert = new SoftAssert();
        Assert.assertTrue(registerLocator.registerAssert().isDisplayed());
        Assert.assertEquals(String.valueOf(registerLocator.registerAssert().getCssValue("color")), "rgba(76, 177, 124, 1)");
        Assert.assertAll();
        driver.quit();
    }

}
