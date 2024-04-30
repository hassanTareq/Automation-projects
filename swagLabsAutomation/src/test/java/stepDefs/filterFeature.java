package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.homePage;
import pages.loginPage;

import java.util.List;

public class filterFeature {
    loginPage loginLocator = new loginPage();
    homePage homeLocator=new homePage();

    @And("click on filter button")
    public void clickOnFilterButton() {
        homeLocator.filter().click();
    }

    @And("select low to high")
    public void selectLowToHigh() {
        Select objSelect =new Select(homeLocator.selectFilter());
        objSelect.selectByVisibleText("Price (low to high)");
    }


    @Then("verify lowest products")
    public void verifyLowestProducts() {
        List<WebElement> product = homeLocator.productPrice();
        Assert.assertTrue(Double.parseDouble(product.getFirst().getText().substring(1))<Double.parseDouble(product.getLast().getText().substring(1)));
        LoginFeature.driver.quit();
    }

    @And("select high to low")
    public void selectHighToLow() {
        Select objSelect =new Select(homeLocator.selectFilter());
        objSelect.selectByVisibleText("Price (high to low)");
    }

    @Then("verify highest products")
    public void verifyHighestProducts() {
        List<WebElement> product = homeLocator.productPrice();
        Assert.assertTrue(Double.parseDouble(product.getFirst().getText().substring(1))>Double.parseDouble(product.getLast().getText().substring(1)));
        LoginFeature.driver.quit();
    }

    @And("select A to Z")
    public void selectAToZ() {
        Select objSelect =new Select(homeLocator.selectFilter());
        objSelect.selectByVisibleText("Name (A to Z)");
    }

    @Then("verify A to Z sorted products")
    public void verifyAToZSortedProducts() {
        List<WebElement> product = homeLocator.productTitle();
        Assert.assertTrue((int)(product.getFirst().getText().charAt(0))<(int)(product.getLast().getText().charAt(0)));
        LoginFeature.driver.quit();
    }

    @And("select Z to A")
    public void selectZToA() {
        Select objSelect =new Select(homeLocator.selectFilter());
        objSelect.selectByVisibleText("Name (Z to A)");
    }

    @Then("verify Z to A sorted products")
    public void verifyZToASortedProducts() {
        List<WebElement> product = homeLocator.productTitle();
        Assert.assertTrue((int)(product.getFirst().getText().charAt(0))>(int)(product.getLast().getText().charAt(0)));
        LoginFeature.driver.quit();
    }
}
