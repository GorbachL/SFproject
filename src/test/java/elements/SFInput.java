package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SFInput {

    private String inputLocator = "//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='%s']/../..//input";

    public void write(WebDriver driver, String label, String text) {
        System.out.println(String.format("Writing text %s into input with label %s", text, label));
        if (null != text) {
            try {
                By inputByLocator = By.xpath(String.format(inputLocator, label));
                driver.findElement(inputByLocator).sendKeys(text);
            } catch (Exception e) {
                Assert.fail(String.format("Cannot write text %s into input with label %s", text, label));
            }
        }
    }
}
