package AndersenLab.Lesson13;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestS2 {
    public ChromeDriver driver;
    String Skype = "//*[@id=\"gatsby-focus-wrapper\"]/footer/section/div/section[3]/div/div[3]/div/a[1]";
    String Email = "@gmail.com";

    @Before
    public void driver() {
        System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void Test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://andersenlab.com/");
        WebElement Sk = driver.findElement(By.xpath(Skype));
        Sk.click();
        Assert.assertEquals("@gmail.com",Email);
    }

    @After
    public void close() {
        driver.quit();
    }
}
