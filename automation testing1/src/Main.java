import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        //open login screen
        driver.get("https://the-internet.herokuapp.com/login");
        // enter the username
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //enter th password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
        // press on login button
        driver.findElement(By.className("radius")).click();
        // check the expected and actual result for valied test case
        Assert.assertEquals(driver.findElement(By.className("columns")).isDisplayed(),true);
        // check with nigative scenario
        Assert.assertEquals(driver.findElement(By.className("error")).isDisplayed(),true);

    }
}