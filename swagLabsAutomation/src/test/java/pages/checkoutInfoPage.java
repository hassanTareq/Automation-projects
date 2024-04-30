package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.LoginFeature;

import java.nio.file.WatchEvent;

public class checkoutInfoPage {
    public WebElement firstname(){
        return  LoginFeature.driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
    }
    public WebElement lastName(){
        return LoginFeature.driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
    }
    public WebElement zipCode(){
        return LoginFeature.driver.findElement(By.cssSelector("input[data-test=\"postalCode\"]"));
    }
    public WebElement continueButton(){
        return LoginFeature.driver.findElement(By.cssSelector("input[data-test=\"continue\"]"));
    }
}
