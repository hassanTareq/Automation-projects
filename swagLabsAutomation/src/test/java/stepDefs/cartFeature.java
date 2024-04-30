package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.cartPage;
import pages.homePage;

public class cartFeature {
    homePage homeLocator=new homePage();
    cartPage cart = new cartPage();
    String productName= homeLocator.productName().getText();
    @An("click on add to cart")
    public void clickonaddtocart(){
        homeLocator.selectProduct().click();
    }

    @And("click on cart")
    public void clickOnCart() {
        homeLocator.CartButton().click();
    }

    @Then("verify selected product")
    public void verifySelectedProduct() {
        Assert.assertEquals(productName.substring((5 - productName.length()) * -1), cart.productName().getText().substring((5 - productName.length()) * -1));
    LoginFeature.driver.quit();
    }
}
