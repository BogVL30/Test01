package AndersenLab.Lesson11;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static AndersenLab.Test01.driver;

public class TestCase02 {
    @Test
    public void negativ() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://bbc.com/");

        String signin = "//*[@id=\"signin-page\"]/div[2]/div/div[2]/a/span";
        String registerNow = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]/div[2]/fieldset/div[1]/a[2]/span";


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
        elementLogo.sendKeys("PetyaPetrov@mail.ru");
        WebElement elementPass = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        elementPass.sendKeys("", Keys.ENTER);
        WebElement elementPass1 = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        elementPass1.sendKeys("777772313", Keys.ENTER);
        WebElement elementPass2 = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        elementPass2.sendKeys("asdxasdas", Keys.ENTER);
        WebElement elementPass3 = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        elementPass3.sendKeys("A12sds", Keys.ENTER);
    }

    @After
    public void close() {
        driver.quit();
    }
}
