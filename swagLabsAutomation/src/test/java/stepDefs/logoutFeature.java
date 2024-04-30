package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.homePage;
import pages.loginPage;

import java.util.concurrent.TimeUnit;

public class logoutFeature {
    homePage homeLocator=new homePage();
    loginPage loginLocator = new loginPage();
    @And("expand the side curtain")
    public void expandthesidecurtain(){
        homeLocator.sideCurtain().click();
    }

    @And("click on logout")
    public void clickOnLogout() {
       LoginFeature.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       homeLocator.logoutButton().click();
    }

    @Then("verify logout action")
    public void verifyLogoutAction() {
        Assert.assertTrue(loginLocator.loginHeader().isDisplayed());
        LoginFeature.driver.quit();
    }
}
