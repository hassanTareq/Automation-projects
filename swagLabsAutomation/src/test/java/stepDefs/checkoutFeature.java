package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.bidi.log.Log;
import org.testng.Assert;
import pages.cartPage;
import pages.checkoutInfoPage;
import pages.finishPage;

public class checkoutFeature {
    cartPage cart = new cartPage();
    checkoutInfoPage checkoutInfo= new checkoutInfoPage();
    finishPage finish = new finishPage();
    @And("click on checkout")
    public void clickoncheckout(){
        cart.checkoutButton().click();
    }

    @And("enter firstname")
    public void enterFirstname() {
       checkoutInfo.firstname().sendKeys("hassan");
    }

    @And("enter lastname")
    public void enterLastname() {
        checkoutInfo.lastName().sendKeys("tarek");
    }

    @And("enter zipCode")
    public void enterZipCode() {
        checkoutInfo.zipCode().sendKeys("92290200");
    }

    @And("click on continue")
    public void clickOnContinue() {
       checkoutInfo.continueButton().click();
    }

    @And("click on finish")
    public void clickOnFinish() {
       finish.finishButton().click();
    }


    @Then("verify the order is placed")
    public void verifyTheOrderIsPlaced() {
        Assert.assertTrue(finish.finishImage().isDisplayed());
        LoginFeature.driver.quit();
    }
}
