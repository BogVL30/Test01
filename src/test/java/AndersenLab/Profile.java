package AndersenLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
    public WebDriver driver;

    public Profile(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"drop_right_menu\"]")
    private WebElement userMenu;

    @FindBy(xpath = "//*[@id=\"navbar_user-collapse\"]/ul[1]/li[10]/div/div/div[1]/a[2]")
    private WebElement logoutBtn;

    public String getUserName() {
        String userName = userMenu.getText();
        return userName;
    }

    public void entryMenu() {
        userMenu.click();
    }

    public void userLogout() {
        logoutBtn.click();
    }
}


