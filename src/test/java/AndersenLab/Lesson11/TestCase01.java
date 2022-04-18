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
    public void positive() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bbc.com/");

        String signin = "//*[@id=\"idcta-link\"]";
        String registerNow = "//*[@id=\"signin-page\"]/div[2]/div/div[2]/a";
        String thanksYes = "//*[@id=\"marketingOptIn\"]/div[1]/div[1]/label/div/div";
        String ageAdd = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/fieldset/div[1]/a[2]";
        String ageInfo = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[2]/fieldset/div[2]/button";

        WebElement inputBefore = driver.findElement(By.xpath(signin));
        inputBefore.click();
        WebElement input = driver.findElement(By.xpath(registerNow));
        input.click();
        Thread.sleep(7000);
        WebElement info = driver.findElement(By.xpath(ageInfo));
        info.click();
        WebElement age = driver.findElement(By.xpath(ageAdd));
        age.click();
        WebElement birthday = driver.findElement(By.xpath("//*[@id=\"day-input\"]"));
        birthday.sendKeys("01");
        WebElement Month = driver.findElement(By.xpath("//*[@id=\"month-input\"]"));
        Month.sendKeys("01");
        WebElement year = driver.findElement(By.xpath("//*[@id=\"year-input\"]"));
        year.sendKeys("1980");
        Thread.sleep(5000);
        WebElement Continue = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        Continue.click();
        WebElement elementLogo = driver.findElement(By.xpath("//*[@id=\"user-identifier-input\"]"));
        elementLogo.sendKeys("IvaanIvaeynoov@mail.ru");
        WebElement elementPass = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        elementPass.sendKeys("GaafwYd1653", Keys.ENTER);

        WebElement news = driver.findElement(By.xpath(thanksYes));
        news.click();
        WebElement inputContinue = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        inputContinue.click();
}
    @After
    public void close(){
        driver.quit();
    }
}

