package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

import java.time.Duration;

public class PlaceOrder {
    ChromeDriver driver;
    @Given("user open website")
    public void user_open_website(){
        driver= new ChromeDriver();
        driver.get("https://automationexercise.com/");
//        driver.navigate().refresh();
    }
    @When("user add product to cart")
    public void user_add_product_to_cart(){
        //open page details
        driver.findElement(By.cssSelector("a[href=\"/product_details/2\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("button[type=\"button\"]")).click();
    }
    @And("user click cart button")
    public void user_click_cart_button(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[data-dismiss=\"modal\"]")));
        driver.findElement(By.cssSelector("button[data-dismiss=\"modal\"]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class=\"modal-content\"]")));
//        driver.findElement(By.xpath("//a[@href=\"/view_cart\"]//child::u")).click();
       // driver.navigate().refresh();
        driver.findElement(By.xpath("//a[@href=\"/view_cart\"]//child::i")).click();
    }


    @And("user click proceed to CheckOut")
    public void user_click_proceed_to_CheckOut(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Proceed To Checkout")).click();
    }
    @And("user click login")
    public void user_click_login(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(webDriver ->driver.findElement(By.cssSelector("div[class=\"modal-content\"]")).isDisplayed());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class=\"modal-content\"]")));
        driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]//parent::div//parent::div/div/p/a")).click();
        //login
        driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]")).sendKeys("hassan16@gmail.com");
        driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]")).sendKeys("hass@n683");
        driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]")).click();
    }
    @And("user click on cart button")
    public void user_click_on_cart_button(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href=\"/view_cart\"]//child::i")).click();
    }
    @And("user click on proceed to checkout button")
    public void user_click_on_proceed_to_checkout_button(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Proceed To Checkout")).click();
    }
    @And("user enter description")
    public void user_enter_description(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("Deliver this package at the day time");

    }
    @And("user click place order")
    public void user_click_place_order(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a[href=\"/payment\"]")).click();
    }
    @And("user enter payment details and click on pay")
    public void  user_enter_payment_details_and_click_on_pay(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //card details
        driver.findElement(By.cssSelector("input[data-qa=\"name-on-card\"]")).sendKeys("hasan");
        driver.findElement(By.cssSelector("input[data-qa=\"card-number\"]")).sendKeys("340954575848969594");
        driver.findElement(By.cssSelector("input[data-qa=\"cvc\"]")).sendKeys("123");
        driver.findElement(By.cssSelector("input[data-qa=\"expiry-month\"]")).sendKeys("04");
        driver.findElement(By.cssSelector("input[data-qa=\"expiry-year\"]")).sendKeys("2025");
        driver.findElement(By.cssSelector("button[data-qa=\"pay-button\"]")).click();
    }
    @Then("user has placed the order successfully")
    public void user_has_placed_the_order_successfully(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.cssSelector("h2[data-qa=\"order-placed\"]")).isDisplayed());
    }
}
