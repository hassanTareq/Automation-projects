import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FINDELEMINTS {
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
    @AfterMethod
    void close(){
        driver.quit();
    }
}
