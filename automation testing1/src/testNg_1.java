import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNg_1 {
    ChromeDriver driver;
    @BeforeMethod
 //   open the URL for each test case
    void setup(){
    driver= new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    }
    // set of test cases
    @Test
    // positve tset case
    void TC_1(){
    // type the username in the username field
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    // type the password in the password field
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    // click on login button
    driver.findElement(By.id("login-button")).click();
    // the expected result with the actual result
    Assert.assertTrue(driver.findElement(By.className("app_logo")).isDisplayed());
    }
    @Test
    void TC_2(){
        // type the username in the username field
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        // type the password in the password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // click on login button
        driver.findElement(By.id("login-button")).click();
        // the expected result with the actual result
        Assert.assertTrue(driver.findElement(By.className("app_logo")).isDisplayed());
    }
    @Test
    void TC_3(){
        // type the username in the username field
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        // type the password in the password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // click on login button
        driver.findElement(By.id("login-button")).click();
        // the expected result with the actual result
        Assert.assertTrue(driver.findElement(By.className("app_logo")).isDisplayed());
    }
// nigative test case
    @Test
    void TC_4(){
        // type the username in the username field
        driver.findElement(By.id("user-name")).sendKeys("standard_use");
        // type the password in the password field
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // click on login button
        driver.findElement(By.id("login-button")).click();
        // the expected result with the actual result
        Assert.assertTrue(driver.findElement(By.className("error-message-container")).isDisplayed());
    }

    // close the browser after each test case
    @AfterMethod
    void close(){
    driver.quit();
    }
}
