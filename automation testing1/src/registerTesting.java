import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class registerTesting {
    ChromeDriver driver;
    @BeforeMethod
        //   open the URL for each test case
    void setup(){
        driver= new ChromeDriver();
        driver.get("https://automationexercise.com/");
    }
    // set of test cases
    @Test
    // register test case
    void TC_Register(){
        // type the username in the username field
        driver.findElement(By.cssSelector("a[href=\"/login\"]")).click();
        // enter name
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Hassan");
        //enter Email
        driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]")).sendKeys("hassan16@gmail.com");
        //click on signup
        driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]")).click();
        // select title
        driver.findElement(By.cssSelector("div[id=\"uniform-id_gender1\"]")).click();
        // enter password
        driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("hass@n683");
        // select day
        Select day = new Select(driver.findElement(By.cssSelector("select[name=\"days\"]")));
        day.selectByValue("11");
        // select month
        Select month = new Select(driver.findElement(By.cssSelector("select[name=\"months\"]")));
        month.selectByValue("4");
        // select year
        Select year =new Select(driver.findElement(By.cssSelector("select[name=\"years\"]")));
        year.selectByValue("1998");
        // select news litter
        driver.findElement(By.cssSelector("input[name=\"newsletter\"]")).click();
        // enter first name
        driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("Hassan");
        // enter last name
        driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("Tarek");
        // enter company
        driver.findElement(By.cssSelector("input[name=\"company\"]")).sendKeys("HTHAM");
        // enter address
        driver.findElement(By.cssSelector("input[name=\"address1\"]")).sendKeys("alShorouk");
        // select country
        Select country =new Select(driver.findElement(By.cssSelector("select[name=\"country\"]")));
        country.selectByValue("Canada");
        // enter state
        driver.findElement(By.cssSelector("input[name=\"state\"]")).sendKeys("USA");
        // enter city
        driver.findElement(By.cssSelector("input[name=\"city\"]")).sendKeys("Torinto");
        // enter zip code
        driver.findElement(By.cssSelector("input[name=\"zipcode\"]")).sendKeys("12245fvd");
        // enter mobile number
        driver.findElement(By.cssSelector("input[name=\"mobile_number\"]")).sendKeys("0115445457436");
        // click on create account
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        // assert the result
        Assert.assertTrue(driver.findElement(By.xpath("//b[.=\"Account Created!\"]")).isDisplayed());
    }
    // close the browser after each test case
    @AfterMethod
    void close(){
        driver.quit();
    }
}
