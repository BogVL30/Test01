package AndersenLab.Lesson11;

import AndersenLab.ConfProperties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase01 {
    public ChromeDriver driver;

    @Before
    public void driver() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
    }
    @Test
    public void positive() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bbc.com/");

        String signin = "//*[@id=\"signin-page\"]/div[2]/div/div[2]/a/span";
        String registerNow = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[2]/fieldset/div[1]/a[2]/span";
        String ThanksNo = "//*[@id=\"marketingOptIn\"]/div[1]/div[2]/label/div/div/spa";

        WebElement inputBefore = driver.findElement(By.id(signin));
        inputBefore.click();
        WebElement input = driver.findElement(By.id(registerNow));
        input.click();
        WebElement Age = driver.findElement(By.xpath("//*[@id=\"submit-button\"]/span"));
        Age.click();
        WebElement Birthday = driver.findElement(By.xpath("//*[@id=\"day-input\"]"));
        Birthday.sendKeys("01");
        WebElement Month = driver.findElement(By.xpath("//*[@id=\"month-input\"]"));
        Month.sendKeys("01");
        WebElement Year = driver.findElement(By.xpath("//*[@id=\"year-input\"]"));
        Year.sendKeys("1980");
        WebElement Continue = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        Continue.click();
        WebElement elementLogo = driver.findElement(By.xpath("//input[@name='username']"));
        elementLogo.sendKeys("IvanIvanov@mail.ru");
        WebElement elementPass = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        elementPass.sendKeys("Gafd1653", Keys.ENTER);
        WebElement Register = driver.findElement(By.xpath("//*[@id=\"submit-button\"]/span"));
        Register.click();
        WebElement News = driver.findElement(By.id(ThanksNo));
        News.click();
        WebElement inputContinue = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        inputContinue.click();
}
    @After
    public void close(){
        driver.quit();
    }
}

