package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.LoginFeature;

import java.nio.file.WatchEvent;

public class finishPage {
    public WebElement finishButton(){
        return  LoginFeature.driver.findElement(By.cssSelector("button[data-test=\"finish\"]"));
    }
    public WebElement finishImage(){
        return LoginFeature.driver.findElement(By.cssSelector("img[class=\"pony_express\"]"));
    }
}
