package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SFInput {
    String inputLocator = "//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='%s']/../..//input";

    public void write(WebDriver driver, String label, String text) {
        By inputByLocator = By.xpath(String.format(inputLocator, label));
        driver.findElement(inputByLocator).sendKeys(text);
    }
}