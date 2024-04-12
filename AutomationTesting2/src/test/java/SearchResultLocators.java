import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SearchResultLocators {
    WebElement SearchResult(){
        return SearchProduct.driver.findElement(By.cssSelector("Verify 'SEARCHED PRODUCTS' is visible"));
    }
    WebElement ResultRelated(){
        return SearchProduct.driver.findElement(By.xpath("//a[@data-product-id=\"2\"]/parent::div/p"));
    }
}
