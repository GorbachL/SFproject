package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavascriptUtilities;

public class SFSelect {

    private String SELECTOR_LOCATOR = "//div[@class='windowViewMode-maximized active lafPageHost']//span/span[text()='%s']/../..//a";
    private String OPTION_LOCATOR = "//div[contains(@class,'uiMenuList') and contains(@class, 'visible')]/div/ul/li/a[text()='%s']";

    public void write(WebDriver driver, String label, String menu) {

        By selectByLocator = By.xpath(String.format(SELECTOR_LOCATOR, label));
        new JavascriptUtilities().clickJs(driver, driver.findElement(selectByLocator));
        //driver.findElement(selectByLocator).click();

        By optionByLocator = By.xpath(String.format(OPTION_LOCATOR, menu));
        new JavascriptUtilities().clickJs(driver, driver.findElement(optionByLocator));
        //driver.findElement(optionByLocator).click();

//        Actions actions = new Actions(driver);
//        Action selectObject = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build();
//        selectObject.perform();

    }
}

