package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.time.Duration;
import java.util.List;

public class D04_searchStepDef {
    public static ChromeDriver driver;
    SoftAssert Assert= new SoftAssert();
    P03_homePage homePageSelector= new P03_homePage();
    @Given("home page")
    public void home_page(){
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user search product:")
    public void userSearch(List<String> arg0) {

        for (String s : arg0) {
            homePageSelector.SearchField().sendKeys(s);
            homePageSelector.searchbutton().click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            List<WebElement> product= homePageSelector.searchProducts();

                for (WebElement x: product){
                    Assert.assertTrue(x.getText().toLowerCase().contains(s));
                }


        }
    }

    @Then("inspect the result")
    public void inspectTheResult() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        Assert.assertAll();
        driver.quit();
    }

    @When("user search with sku:")
    public void userSearchWithSku(List<String> sku) {
        for (String val : sku){
            homePageSelector.SearchField().sendKeys(val);
            homePageSelector.searchbutton().click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            List<WebElement> product = homePageSelector.searchProducts();
            for (WebElement x: product){
//                driver.findElement(By.linkText(x.getText())).click();
                homePageSelector.productDetails(x.getText()).click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                Assert.assertEquals(homePageSelector.sku().getText(),val);
                driver.navigate().back();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            }
        }
    }
}
