package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.LoginFeature;

public class loginPage {
    public WebElement usernamelocator(){
        return LoginFeature.driver.findElement(By.cssSelector("input[data-test=\"username\"]"));
    }
    public WebElement passwordLocator(){
        return LoginFeature.driver.findElement(By.cssSelector("input[data-test=\"password\"]"));
    }
    public WebElement Loginbutton(){
        return LoginFeature.driver.findElement(By.cssSelector("input[type=\"submit\"]"));
    }
    public WebElement allert(){
        return LoginFeature.driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
    }
    public WebElement loginHeader(){
        return LoginFeature.driver.findElement(By.cssSelector("div[class=\"login_logo\"]"));
    }
}
