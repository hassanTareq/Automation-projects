package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.D01_registerStepDef;
public class p01_register {
    public WebElement registerPage(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }
    public WebElement selectGender(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[value=\"M\"]"));
    }
    public WebElement FirstName(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("input[name=\"FirstName\"]"));
    }
    public WebElement LastName(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("input[name=\"LastName\"]"));
    }
    public WebElement Day(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }
    public WebElement Month(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }
    public WebElement Year(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }
    public WebElement Email(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("input[data-val-required=\"Email is required.\"]"));
    }
    public WebElement password(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("input[data-val-regex-pattern=\"^.{6,}$\"]"));
    }
    public WebElement confirmPassword(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("input[name=\"ConfirmPassword\"]"));
    }
    public WebElement registerButton(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("button[name=\"register-button\"]"));
    }
    public WebElement registerAssert(){
        return  D01_registerStepDef.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}

