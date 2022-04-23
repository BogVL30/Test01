package Lesson14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By login = By.id("Email");
    By password = By.id("pass");
    By loginButton = By.id("login");

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        if (!"Login".equals(driver.getTitle())) {
            throw new IllegalStateException("Error");
        }
    }

    public LoginPage typeUsername(String username) {
        driver.findElement(login).sendKeys(username);
        return this;
    }

    public LoginPage typePass(String pass) {
        driver.findElement(password).sendKeys(pass);
        return this;
    }

    public LoginPage Login() {
        driver.findElement(loginButton).submit();
        return new LoginPage(driver);
    }

    public LoginPage submitLogin() {
        driver.findElement(loginButton).submit();
        return new LoginPage(driver);
    }

    public LoginPage login(String username, String password) {
        typeUsername(username);
        typePass(password);
        return Login();
    }
}
