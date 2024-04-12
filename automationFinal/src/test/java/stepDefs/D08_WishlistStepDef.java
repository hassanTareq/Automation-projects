package stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D08_WishlistStepDef {
    public static ChromeDriver driver;
    P03_homePage homePageSelector= new P03_homePage();
    SoftAssert Assert=new SoftAssert();

    @Given("user open browser {string}")
    public void userOpenBrowser(String arg0) {
        driver= new ChromeDriver();
        driver.get(arg0);
    }

    @When("add product to wishlist")
    public void addProductToWishlist() {
        homePageSelector.productHTC().click();
        homePageSelector.wishList().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePageSelector.sucessMessage()));
    }

    @Then("a message will apear")
    public void aMessageWillApear() {
        Assert.assertTrue(driver.findElement(homePageSelector.sucessMessage()).isDisplayed());
        Assert.assertEquals(driver.findElement(homePageSelector.sucessMessage()).getCssValue("background-color"),"rgba(75, 176, 122, 1)");
        Assert.assertAll();
        driver.quit();
    }

    @And("open wishlistpage")
    public void openWishlistpage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(homePageSelector.sucessMessage()));
        homePageSelector.wishlistPage().click();
    }

    @Then("chick the qty")
    public void chickTheQty() {
        Assert.assertTrue(((Integer.parseInt(homePageSelector.qtyField().getAttribute("value")) > 0)));
        Assert.assertAll();
        driver.quit();
    }
}
