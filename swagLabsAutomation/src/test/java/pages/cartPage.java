package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.LoginFeature;

public class cartPage {
    public WebElement productName(){
        return LoginFeature.driver.findElement(By.cssSelector("div[class=\"inventory_item_name\"]"));
    }
    public WebElement checkoutButton(){
        return LoginFeature.driver.findElement(By.cssSelector("button[data-test=\"checkout\"]"));
    }
    public WebElement removeButton(){
        return LoginFeature.driver.findElement(By.cssSelector("button[data-test=\"remove-test.allthethings()-t-shirt-(red)\"]"));
    }
    public WebElement removedItem(){
        return LoginFeature.driver.findElement(By.xpath("//div[@class=\"cart_list\"]/div[@class=\"removed_cart_item\"]"));
    }
}
