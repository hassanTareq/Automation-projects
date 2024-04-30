package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.homePage;
import pages.loginPage;

public class LoginFeature {
    public static ChromeDriver driver;
    loginPage loginLocator = new loginPage();
    homePage homeLocator=new homePage();
    @Given("user open website")
    public void useropenwebsite(){
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }


    @When("enter valid username {string}")
    public void enterValidUsername(String arg0) {
        loginLocator.usernamelocator().sendKeys(arg0);
    }

    @And("enter valid password {string}")
    public void enterValidPassword(String arg0) {
        loginLocator.passwordLocator().sendKeys(arg0);
    }

    @And("click on login")
    public void clickOnLogin() {
        loginLocator.Loginbutton().click();
    }

    @When("enter invalid username {string}")
    public void enterInvalidUsername(String arg0) {
        loginLocator.usernamelocator().sendKeys(arg0);
    }

    @Then("verify valid login")
    public void verifyValidLogin() {
        Assert.assertTrue(homeLocator.pageHeader().isDisplayed());
        driver.quit();
    }

    @Then("verify invalid login")
    public void verifyInvalidLogin() {
        Assert.assertTrue(loginLocator.allert().isDisplayed());
        driver.quit();
    }
}
