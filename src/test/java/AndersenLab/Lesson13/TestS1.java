package AndersenLab.Lesson13;

import io.opentelemetry.api.internal.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class TestS1 {
    public ChromeDriver driver;

    @Before
    public void driver() {
        System.setProperty("webdriver.chrome.driver", "V:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void Test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://andersenlab.com/");

        String BurgerButton = "//*[@id=\"gatsby-focus-wrapper\"]/header/div[2]/div/div[1]/div/div";
        String TechStack = "//*[@id=\"gatsby-focus-wrapper\"]/header/div[2]/div/div[1]/div[2]/div/nav/div[1]/div[1]";
        String BackEnd = "//*[@id=\"gatsby-focus-wrapper\"]/header/div[2]/div/div[1]/div[2]/div/nav/div[1]/div[2]/div/div/div/div[2]/div[1]";
        String Java = "//*[@id=\"gatsby-focus-wrapper\"]/header/div[2]/div/div[1]/div[2]/div/nav/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div/a[1]";
        String RequestSer = "//*[@id=\"what-we-do\"]/div/div[2]/div[2]/button";
        String JavaConsulting = "//*[@id=\"request-service\"]/div[1]/div/div/label[2]/button";
        String Name = "//*[@id=\"request-service\"]/div[2]/div/div[1]/label/input";
        String Email = "//*[@id=\"request-service\"]/div[2]/div/div[2]/div/label/input";
        String Phone = "//*[@id=\"request-service\"]/div[2]/div/div[3]/label/input";
        String Comment = "//*[@id=\"request-service\"]/div[2]/div/div[4]/label/textarea";



        WebElement BurgerB = driver.findElement(By.xpath(BurgerButton));
        BurgerB.click();
        Thread.sleep(7000);
        WebElement TS = driver.findElement(By.xpath(TechStack));
        TS.click();
        WebElement BE = driver.findElement(By.xpath(BackEnd));
        BE.click();
        WebElement Jav = driver.findElement(By.xpath(Java));
        Jav.click();
        WebElement RS = driver.findElement(By.xpath(RequestSer));
        RS.click();
        WebElement JS = driver.findElement(By.xpath(JavaConsulting));
        JS.click();
        Thread.sleep(5000);
        WebElement Inputname = driver.findElement(By.xpath(Name));
        Inputname.sendKeys("Papa");
        WebElement Inputemail = driver.findElement(By.xpath(Email));
        Inputemail.sendKeys("NCja.adk@mail.ru");
        WebElement Inputphone = driver.findElement(By.xpath(Phone));
        Inputphone.sendKeys("+375296584165");
        WebElement Inputcomment = driver.findElement(By.xpath(Comment));
        Inputcomment.sendKeys("Test");
        for(String Handle1 : driver.getWindowHandles()){
            driver.switchTo().window(Handle1);
        }
        Assert.assertEquals("https://andersenlab.com/find-developers/java", driver.getCurrentUrl());
    }

    @After
    public void close() {
        driver.quit();
    }
}

