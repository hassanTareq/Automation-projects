package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {
    public static ChromeDriver driver;
    WebDriverWait wait ;
    SoftAssert Assert= new SoftAssert();
    P03_homePage homePageSelector= new P03_homePage();
    @Given("user open browser and navigate to home page")
    public void useropenbrowsrandnavigatetohomepage (){
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user clicks on first slider")
    public void userClicksOnFirstSlider() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        homePageSelector.clickOnSlide().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
    }

    @Then("user navigate to slider content")
    public void userNavigateToSliderContent() {
        Assert.assertAll();
    }

    @When("user clicks on second slider")
    public void userClicksOnSecondSlider() {
        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(homePageSelector.image2()));
        homePageSelector.clickOnSlide().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"));
    }
}
