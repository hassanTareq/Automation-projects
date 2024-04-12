package stepDefs;

import dev.failsafe.internal.util.Maths;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {
    public static ChromeDriver driver = new ChromeDriver();
    P03_homePage homePageSelector= new P03_homePage();
    Random rand = new Random();
    Actions act = new Actions(driver);
    SoftAssert Assert= new SoftAssert();

    @Given("user navigate to home page")
    public void user_navigate_to_home_page(){
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user hover on category list")
    public void userHoverOnCategoryList() {
        List<WebElement> navigationBar=homePageSelector.topMenu();
        int index1= rand.nextInt(2);
        act.moveToElement(navigationBar.get(index1)).perform();
        String topmenuName="/"+navigationBar.get(index1).getText().toLowerCase();
//        System.out.println(topmenuName);
        int index= rand.nextInt(3);
        List<WebElement> sub_menu = homePageSelector.subMenu(topmenuName);
//        System.out.println(sub_menu.get(index).getText());
        WebElement selectedItem=sub_menu.get(index);
        String selectedVal=selectedItem.getText();
        act.moveToElement(selectedItem).click().perform();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println();
        Assert.assertTrue(selectedVal.equalsIgnoreCase(homePageSelector.relatedPage().getText()));

    }

    @Then("related screen will open")
    public void relatedScreenWillOpen() {
        Assert.assertAll();
        driver.quit();
    }
}

//List<WebElement> sub_menu = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/ul"));
//        act.moveToElement(sub_menu.get(rand.nextInt(index))).click().perform();
//        System.out.println(sub_menu.get(index).getText());



//a[@href="/computers"]//parent::li/ul
//a[@href="+topmenuName+"]//parent::li//parent::ul[@class="top-menu notmobile"]/li/a[@href="+topmenuName+"]/following-sibling::ul/li/a
