package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.LoginFeature;

import java.util.List;

public class homePage {
    public WebElement pageHeader(){
        return LoginFeature.driver.findElement(By.xpath("//div[@class=\"header_label\"]/div"));
    }
    public WebElement filter(){
        return LoginFeature.driver.findElement(By.cssSelector("select[class=\"product_sort_container\"]"));
    }
    public WebElement selectFilter(){
        return LoginFeature.driver.findElement(By.cssSelector("select[class=\"product_sort_container\"]"));
    }
    public List<WebElement> productPrice(){
        return LoginFeature.driver.findElements(By.cssSelector("div[class=\"inventory_item_price\"]"));
    }
    public List<WebElement> productTitle(){
        return LoginFeature.driver.findElements(By.cssSelector("div[class=\"inventory_item_name \"]"));
    }
    public WebElement sideCurtain(){
        return LoginFeature.driver.findElement(By.cssSelector("button[id=\"react-burger-menu-btn\"]"));
    }
    public WebElement logoutButton(){
        return  LoginFeature.driver.findElement(By.linkText("Logout"));
    }
   public WebElement selectProduct(){
        return LoginFeature.driver.findElement(By.cssSelector("button[data-test=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
   }
   public WebElement productName(){
        return LoginFeature.driver.findElement(By.xpath("//button[@data-test=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]//parent::div//parent::div/div/a/div"));
   }
   public WebElement CartButton(){
        return LoginFeature.driver.findElement(By.cssSelector("a[class=\"shopping_cart_link\"]"));
   }
}
