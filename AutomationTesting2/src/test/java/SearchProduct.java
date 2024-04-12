import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchProduct {
   static ChromeDriver driver;
    homeLocators home = new homeLocators();
    ProductPageLocators productPage = new ProductPageLocators();
    SearchResultLocators Result= new SearchResultLocators();
    @BeforeMethod
    void setup(){
        driver= new ChromeDriver();
        driver.get("https://automationexercise.com/");
    }
    @Test
    void SuccessfulSearchProduct(){
        SoftAssert soft = new SoftAssert();
        // verify home page is displayed (1)
        soft.assertTrue(home.homePageImg().isDisplayed());
        // click on products button
        home.ProductButton().click();
        // verify user is navigated to ALL PRODUCTS page successfully (2)
        soft.assertTrue(productPage.ProductShopImg().isDisplayed());
        // serach product
        productPage.searchProduct().sendKeys("Men Tshirt");
        // click on search button
        productPage.SearchButton().click();
        //Verify 'SEARCHED PRODUCTS' is visible
        soft.assertTrue(Result.SearchResult().isDisplayed());
        //Verify all the products related to search are visible
        soft.assertTrue(Result.ResultRelated().isDisplayed());
        soft.assertAll();

    }
    @AfterMethod
    void close(){
        driver.quit();
    }
}
