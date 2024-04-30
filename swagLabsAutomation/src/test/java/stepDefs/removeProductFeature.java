package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.cartPage;

public class removeProductFeature {
    cartPage cart = new cartPage();
    @And("click on remove")
    public void clickonremove(){
        cart.removeButton().click();
    }

    @Then("verify removed item")
    public void verifyRemovedItem() {
        Assert.assertTrue(cart.removedItem().getText().isEmpty());
        LoginFeature.driver.quit();
    }
}
