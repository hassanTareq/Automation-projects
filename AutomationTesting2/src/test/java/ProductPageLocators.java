import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class ProductPageLocators {
    WebElement ProductShopImg(){
        return SearchProduct.driver.findElement(By.cssSelector("img[src=\"/static/images/shop/sale.jpg\"]"));
    }
    WebElement searchProduct(){
        return SearchProduct.driver.findElement(By.cssSelector("input[id=\"search_product\"]"));
    }
    WebElement SearchButton(){
        return SearchProduct.driver.findElement(By.cssSelector("button[id=\"submit_search\"]"));
    }
}
