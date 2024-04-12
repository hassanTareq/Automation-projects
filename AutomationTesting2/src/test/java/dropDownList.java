import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dropDownList {
    ChromeDriver driver;
    @BeforeMethod
        //   open the URL for each test case
    void setup(){
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    // set of test cases
    @Test
    void FindElements(){
        driver.findElements(By.tagName("option")).get(1).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value=\"1\"]")).isSelected());
    }
    // register test case
    @Test
    void Select(){
        Select s = new Select(driver.findElement(By.cssSelector("select[id=\"dropdown\"]")));
        s.selectByValue("1");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.cssSelector("option[value=\"1\"]")).isSelected());
        soft.assertAll();
    }
    @AfterMethod
    void close(){
        driver.quit();
    }
}
