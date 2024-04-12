package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefs.D02_loginStepDef;
public class P02_login {
   public WebElement Login(){
        return D02_loginStepDef.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }
    public WebElement email(){
       return  D02_loginStepDef.driver.findElement(By.cssSelector("input[data-val-email=\"Wrong email\"]"));
    }
    public WebElement password(){
        return  D02_loginStepDef.driver.findElement(By.cssSelector("input[type=\"password\"]"));
    }
    public WebElement loginButton(){
        return  D02_loginStepDef.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement successfulLogin1(){
        return  D02_loginStepDef.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
//    public String successfulLogin2(){
//        return  D02_loginStepDef.
//    }
    public WebElement invalidLogin(){
        return  D02_loginStepDef.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
