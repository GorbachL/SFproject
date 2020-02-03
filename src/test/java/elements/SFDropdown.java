package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class SFDropdown {

    String dropDownSelector = "//div[contains(@class,'uiInput uiInputSelect forceInputPicklist uiInput--default uiInput--select')]//span[text()='%s']/../..//a";

    public void write(WebDriver driver, String label) {

        By dropdownByLocator = By.xpath(String.format(dropDownSelector, label));
        driver.findElement(dropdownByLocator).click();

        Actions actions = new Actions(driver);
        Action selectObject = actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build();
        selectObject.perform();

    }
}
