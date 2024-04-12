package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.*;

import java.util.List;

public class P03_homePage {
    public WebElement currencySelector(){
        return D03_currenciesStepDef.driver.findElement(By.cssSelector("select[name=\"customerCurrency\"]"));
    }
    public List<WebElement> productsSelector(){
        return D03_currenciesStepDef.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    public WebElement SearchField(){
        return  D04_searchStepDef.driver.findElement(By.cssSelector("input[aria-label=\"Search store\"]"));
    }
    public WebElement searchbutton(){
        return D04_searchStepDef.driver.findElement(By.xpath("//input[@aria-label=\"Search store\"]//parent::form/button"));
    }
    public List<WebElement> searchProducts(){
        return D04_searchStepDef.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public WebElement productDetails(String val){
        return D04_searchStepDef.driver.findElement(By.linkText(val));
    }
    public WebElement sku(){
        return D04_searchStepDef.driver.findElement(By.xpath("//div[@class=\"sku\"]/span[@class=\"value\"]"));
    }
    public List<WebElement> topMenu(){
        return D05_hoverCategoriesStepDef.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]//parent::div/ul[@class=\"top-menu notmobile\"]/li/a"));
    }
    public List<WebElement> subMenu(String topmenuName){
        return D05_hoverCategoriesStepDef.driver.findElements(By.xpath("//a[@href='"+topmenuName+"']//parent::li//parent::ul[@class=\"top-menu notmobile\"]/li/a[@href='"+topmenuName+"']/following-sibling::ul/li/a"));
    }
    public WebElement relatedPage(){
        return D05_hoverCategoriesStepDef.driver.findElement(By.xpath("//div[@class=\"page-title\"]/h1"));
    }
    public WebElement clickOnSlide(){
        return D06_homeSlidersStepDef.driver.findElement(By.xpath("//a[@href=\"#\"]//parent::div[@class=\"nivo-controlNav\"]//parent::div/div[@id=\"nivo-slider\"]"));
    }
    public By image2(){
        return By.xpath("//a[@style=\"display: block;\"]/img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000089_banner_02.webp\"]");
    }
    public WebElement FacebookLink(){
        return  D07_followUsStepDef.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement twitterLink(){
        return D07_followUsStepDef.driver.findElement(By.linkText("Twitter"));
    }
    public WebElement rssLink(){
        return D07_followUsStepDef.driver.findElement(By.linkText("RSS"));
    }
    public WebElement youtubeLink(){
        return D07_followUsStepDef.driver.findElement(By.linkText("YouTube"));
    }
    public WebElement productHTC(){
        return D08_WishlistStepDef.driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }
    public WebElement wishList(){
        return D08_WishlistStepDef.driver.findElement(By.cssSelector("button[id=\"add-to-wishlist-button-18\"]"));
    }
    public By sucessMessage(){
        return By.cssSelector("div[class=\"bar-notification success\"]");
    }
    public WebElement wishlistPage(){
        return D08_WishlistStepDef.driver.findElement(By.xpath("//li/a[@class=\"ico-wishlist\"]"));
    }
    public WebElement qtyField(){
        return D08_WishlistStepDef.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
