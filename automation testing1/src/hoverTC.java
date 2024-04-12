import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class hoverTC {
    ChromeDriver driver;
    @BeforeMethod
        //   open the URL for each test case
    void setup(){
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
    }
    // set of test cases
    @Test
    void hoverTC(){
        // setting hover
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[@href=\"/users/1\"]/parent::div/parent::div/img"))).perform();
        // explicit wait: used when i wait for a component to load at the UI page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("View profile")));
        driver.findElement(By.linkText("View profile")).click();
        // soft assertion used when i need to do many assertion for one test case
        SoftAssert S_assert= new SoftAssert();
        S_assert.assertTrue(driver.getCurrentUrl().contains("users/1"));
       S_assert.assertAll();
    }
    // close the browser after each test case
    @AfterMethod
    void close(){
        driver.quit();
    }
}
