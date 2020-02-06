package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.PropertyManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    PropertyManager prop;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @BeforeClass
    public void loadProperties() {
        prop = new PropertyManager();
    }

//    @AfterMethod
//    public void afterTest() {
//        driver.quit();
//    }
}
