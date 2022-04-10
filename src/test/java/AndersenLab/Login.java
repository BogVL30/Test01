package AndersenLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public WebDriver driver;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=signupform-username]")
    private WebElement loginField;
    @FindBy(xpath = "//*[@id=signupform-email]")
    private WebElement emailField;
    @FindBy(xpath = "//*[@id=signup_btn]")
    private WebElement loginBtn;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputEmail(String Email) {
        emailField.sendKeys(email);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
