package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.P03_homePage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class D07_followUsStepDef {
    public static ChromeDriver driver;
    P03_homePage homePageSelector= new P03_homePage();
    @Given("user open browser")
    public void useropenbrowser(){
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user opens facebook link")
    public void userOpensFacebookLink() {
       homePageSelector.FacebookLink().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("{string}  is opened facebook")
    public void isOpenedFacebook(String arg0) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(arg0, driver.getCurrentUrl());
        driver.quit();
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        homePageSelector.twitterLink().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Then("{string} is opened twitter")
    public void isOpenedTwitter(String arg0) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(arg0, driver.getCurrentUrl());
        driver.quit();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        homePageSelector.rssLink().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(arg0, driver.getCurrentUrl());
        driver.quit();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        homePageSelector.youtubeLink().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Then("{string} youtube opened in new tab")
    public void youtubeOpenedInNewTab(String arg0) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(arg0, driver.getCurrentUrl());
        driver.quit();
    }
}
