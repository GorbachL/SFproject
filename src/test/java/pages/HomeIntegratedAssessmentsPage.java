package pages;

import elements.SFDropdown;
import elements.SFInput;
import elements.SFTextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeIntegratedAssessmentsPage extends BasePage {

    String URL = "https://seniorlink--staging.lightning.force.com/lightning/r/0064F000006lAKhQAM/related/Home_Assessments__r/view?ws=%2Flightning%2Fr%2FOpportunity%2F0064F000006lAKhQAM%2Fview";
    By NEW_BUTTON = By.xpath("//div[contains(text(), 'New')]");
    By NEXT_BUTTON = By.xpath("//span[contains(text(), 'Next')]");
    By DUPLICATE_YES = By.xpath("//button[contains(@class,'slds-button slds-button') and text()='Yes']\n");

    By ASSESSMENT_DATE = By.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='Assessment Date']/../..//input");
    By ASSESSOR_DATE = By.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='Date Assessor Signed']/../..//input");

    By SAVE_BUTTON = By.xpath("//div[@class='windowViewMode-maximized active lafPageHost']//span[text()='Save']");

    public HomeIntegratedAssessmentsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(URL);
        isPageOpened();
    }

    public void isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NEW_BUTTON));
    }

    public HomeIntegratedAssessmentsPage clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return this;
    }

    public HomeIntegratedAssessmentsPage clickNext() {
        driver.findElement(NEXT_BUTTON).click();
        return this;
    }

    public HomeIntegratedAssessmentsPage clickYes() {
        driver.findElement(DUPLICATE_YES).click();
        return this;
    }

    public void fillInInputFields() {
        new SFInput().write(driver, "Assessment Date", "01/12/2020");
        new SFInput().write(driver, "Date Assessor Signed", "01/14/2020");
    }

    public void fillInTextFields() {
        new SFTextArea().write(driver, "Accessibility Concerns Explained", "TEST Accessibility Concerns Explained");
        new SFTextArea().write(driver, "Home Description Comments", "TEST Home Description Comments");
        new SFTextArea().write(driver, "Home Meaning Comments", " TEST Home Meaning Comments");
        new SFTextArea().write(driver, "Home Story Comments", "TEST Home Story Comments");
        new SFTextArea().write(driver, "Home Stability Comments", "TEST Home Stability Comments");
        new SFTextArea().write(driver, "Energy Assistance Comments", "TEST Energy Assistance Comments");
        new SFTextArea().write(driver, "Food Assistance Comments", "TEST Food Assistance Comments");
        new SFTextArea().write(driver, "Smokers Comments", "TEST Smokers Comments");
        new SFTextArea().write(driver, "Pets Comments", "TEST Pets Comments");
        new SFTextArea().write(driver, "Life Essentials General Comments", "TEST Life Essentials General Comments");
        new SFTextArea().write(driver, "Neighborhood Safety Comments", "TEST Neighborhood Safety Comments");
        new SFTextArea().write(driver, "General Security Comments", "TEST General Security Comments");
        new SFTextArea().write(driver, "Consumer Safety Comments", "TEST Consumer Safety Comments");
        new SFTextArea().write(driver, "Caregiver Safety Comments", "TEST Caregiver Safety Comments");
        new SFTextArea().write(driver, "Home/Environment Comments", "TEST Home/Environment Comments");
    }

    public void selectDropdownOption() {
        new SFDropdown().write(driver, "Status");
        new SFDropdown().write(driver, "Assessment Type");
        new SFDropdown().write(driver, "Assessment Type");
        new SFDropdown().write(driver, "Dwelling Type");
        new SFDropdown().write(driver, "Accessibility Concerns");
        new SFDropdown().write(driver, "Family Living On");
        new SFDropdown().write(driver, "Number of Bedrooms");
        new SFDropdown().write(driver, "Internet in Home");
        new SFDropdown().write(driver, "Stairs Required to Consumer Bedroom");
        new SFDropdown().write(driver, "Wifi in Home");
        new SFDropdown().write(driver, "Number of Bathrooms");
        new SFDropdown().write(driver, "Computer / Tablet in Home");
        new SFDropdown().write(driver, "Stairs Required to Consumer Bathroom");
        new SFDropdown().write(driver, "Caregiver Smart Phone");
        new SFDropdown().write(driver, "Caregiver Smart Phone Brand");
        new SFDropdown().write(driver, "Caregiver Technology Proficiency");
        new SFDropdown().write(driver, "Home Ownership (Current Status)");
        new SFDropdown().write(driver, "Home Stability");
        new SFDropdown().write(driver, "Life Essentials");
        new SFDropdown().write(driver, "Energy Assistance");
        new SFDropdown().write(driver, "Food Assistance");
        new SFDropdown().write(driver, "Referral for Energy Assistance");
        new SFDropdown().write(driver, "Referral for Food Assistance");
        new SFDropdown().write(driver, "Pets In Home?");
        new SFDropdown().write(driver, "Smokers in the Home");
        new SFDropdown().write(driver, "Problems with Pets");
        new SFDropdown().write(driver, "Overall Safety Concerns");
        new SFDropdown().write(driver, "Does Consumer Feel Safe?");
        new SFDropdown().write(driver, "Does Caregiver Feel Safe?");
    }

    public void saveForm() {
        driver.findElement(SAVE_BUTTON).click();
    }

}
