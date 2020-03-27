package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    WebElement usernameInput;
    @FindBy(name = "pw")
    WebElement passwordInput;
    @FindBy(name = "Login")
    WebElement login;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://seniorlink--staging.cs93.my.salesforce.com/");
        isPageOpened();
        PageFactory.initElements(driver, LoginPage.this);
    }

    public void isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Login")));
        } catch (TimeoutException ex) {
            System.out.println("Page is not opened");
            throw new TimeoutException("Page is not opened");
        }
    }

    public void loginUser(String userName, String password) {
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        login.click();
    }
}
