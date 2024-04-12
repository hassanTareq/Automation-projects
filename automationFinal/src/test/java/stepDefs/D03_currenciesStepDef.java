package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class D03_currenciesStepDef {
    public static ChromeDriver driver;
    P03_homePage homePageSelector= new P03_homePage();

    @Given("user open home page")
    public void user_open_home_page(){
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user select Euro currency")
    public void userSelectEuroCurrency() {
        Select currency= new Select(homePageSelector.currencySelector());
        currency.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("euro symbol is displayed")
    public void euroSymbolIsDisplayed() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        List<WebElement> product= homePageSelector.productsSelector();
        int i=0;
        SoftAssert Assert=new SoftAssert();
        for (WebElement span : product)
        {
            Assert.assertEquals(span.getText().charAt(0),'€');
        }
        Assert.assertAll();
    }
}
