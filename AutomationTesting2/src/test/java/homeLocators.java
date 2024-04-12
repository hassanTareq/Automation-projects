import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class homeLocators{
    WebElement homePageImg(){
        return SearchProduct.driver.findElement(By.cssSelector("img[src=\"/static/images/home/logo.png\"]"));
    }
    WebElement ProductButton(){
        return SearchProduct.driver.findElement(By.cssSelector("a[href=\"/products\"]"));
    }
}
