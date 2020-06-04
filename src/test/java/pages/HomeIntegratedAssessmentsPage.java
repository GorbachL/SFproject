package pages;

import elements.SFSelect;
import elements.SFInput;
import elements.SFTextArea;
import models.HIS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public void fillInInputFields(HIS his) {
        new SFInput().write(driver, "Assessment Date", his.getAccessibilityConcerns());
        new SFInput().write(driver, "Date Assessor Signed", his.getDateAssessorSigned());
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

    public void selectDropdownOption(HIS his) {
        new SFSelect().write(driver, "Status", his.getStatus());
        new SFSelect().write(driver, "Assessment Type", his.getAssessmentType());
        new SFSelect().write(driver, "Dwelling Type", his.getDwellingType());
        new SFSelect().write(driver, "Accessibility Concerns", his.getAccessibilityConcerns());
        new SFSelect().write(driver, "Family Living On", his.getFamilyLivingOn());
        new SFSelect().write(driver, "Number of Bedrooms", his.getNumberOfBedrooms());
        new SFSelect().write(driver, "Internet in Home", his.getInternetInHome());
        new SFSelect().write(driver, "Stairs Required to Consumer Bedroom", his.getStairsRequiredToConsumerBedroom());
        new SFSelect().write(driver, "Wifi in Home", his.getWifiInHome());
        new SFSelect().write(driver, "Number of Bathrooms", his.getNumberOfBathrooms());
        new SFSelect().write(driver, "Computer / Tablet in Home", his.getComputerTabletInHome());
        new SFSelect().write(driver, "Stairs Required to Consumer Bathroom", his.getStairsRequiredToConsumerBedroom());
        new SFSelect().write(driver, "Caregiver Smart Phone", his.getCaregiverSmartPhone());
        new SFSelect().write(driver, "Caregiver Smart Phone Brand", his.getCaregiverSmartPhoneBrand());
        new SFSelect().write(driver, "Caregiver Technology Proficiency", his.getCaregiverTechnologyProficiency());
        new SFSelect().write(driver, "Home Ownership (Current Status)", his.getHomeOwnershipCurrentStatus());
        new SFSelect().write(driver, "Home Stability", his.getHomeStability());
        new SFSelect().write(driver, "Life Essentials", his.getLifeEssentials());
        new SFSelect().write(driver, "Energy Assistance", his.getEnergyAssistance());
        new SFSelect().write(driver, "Food Assistance", his.getFoodAssistance());
        new SFSelect().write(driver, "Referral for Energy Assistance", his.getReferralForEnergyAssistance());
        new SFSelect().write(driver, "Referral for Food Assistance", his.getReferralForFoodAssistance());
        new SFSelect().write(driver, "Pets In Home?", his.getPetsInHome());
        new SFSelect().write(driver, "Smokers in the Home", his.getSmokersInTheHome());
        new SFSelect().write(driver, "Problems with Pets", his.getProblemsWithPets());
        new SFSelect().write(driver, "Overall Safety Concerns", his.getOverallSafetyConcerns());
        new SFSelect().write(driver, "Does Consumer Feel Safe?", his.getDoesConsumerFeelSafe());
        new SFSelect().write(driver, "Does Caregiver Feel Safe?", his.getDoesCaregiverFeelSafe());
    }

    public void saveForm() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
