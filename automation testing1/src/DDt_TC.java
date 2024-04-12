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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class DDt_TC {
    ChromeDriver driver;
    @BeforeMethod
        //   open the URL for each test case
    void setup(){
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @Test(dataProvider = "provider")
    void Login_TC(String userName,String Password){
        // type the username in the username field
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys(userName);
        // type the password in the password field
        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys(Password);
        // click on login button
        driver.findElement(By.cssSelector("button[class=\"radius\"]")).click();
        // the expected result with the actual result
        if(userName=="tomsmith" && Password=="SuperSecretPassword!") {
            Assert.assertTrue(driver.findElement(By.cssSelector("a[class=\"button secondary radius\"]")).isDisplayed());
        }
        else {
            Assert.assertTrue(driver.findElement(By.cssSelector("div[class=\"flash error\"]")).isDisplayed());
        }
    }
    @DataProvider(name="provider")
    String[][] giveData(){
        String data[][]={
                {"tomsmith","SuperSecretPassword!"},
                {"dsfasd","vhdsoihsp"},
                {"ljhoiss","smgsGg"}
        };
        return data;
    }
    @AfterMethod
    void close(){
        driver.quit();
    }
}
