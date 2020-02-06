package tests;

import models.HIS;
import org.testng.annotations.Test;
import pages.HomeIntegratedAssessmentsPage;
import pages.LoginPage;

public class SFTest extends BaseTest {

    @Test
    public void completeForm() {
        HIS his = HIS.builder()
                .AssessmentDate("01/12/2020")
                .DateAssessorSigned("01/12/2020")
                .Status("In Progress")
                .AssessmentType("Update")
                .DwellingType("Single (Detached) dwelling")
                .AccessibilityConcerns("Yes")
                .FamilyLivingOn("Single Level -- Bottom Floor (or basement)")
                .NumberOfBedrooms("1 Bedroom")
                .InternetInHome("Yes")
                .StairsRequiredToConsumerBedroom("Yes")
                .WifiInHome("Yes")
                .NumberOfBathrooms("1 Bathroom")
                .ComputerTabletInHome("Yes")
                .StairsRequiredToConsumerBathroom("Yes")
                .CaregiverSmartPhone("Yes")
                .CaregiverSmartPhoneBrand("Android")
                .CaregiverTechnologyProficiency("Poor")
                .HomeOwnershipCurrentStatus("Owned by Caregiver")
                .HomeStability("Appears Stable")
                .LifeEssentials("Yes - Adequate")
                .EnergyAssistance("Yes")
                .FoodAssistance("Yes")
                .ReferralForEnergyAssistance("Yes")
                .ReferralForFoodAssistance("Yes")
                .PetsInHome("Yes")
                .SmokersInTheHome("No")
                .ProblemsWithPets("No")
                .OverallSafetyConcerns("No")
                .DoesConsumerFeelSafe("Yes")
                .DoesCaregiverFeelSafe("Yes")
                .build();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        //loginPage.loginUser("aqa1@mailinator.com", System.getProperty("password"));
        loginPage.loginUser(prop.get("username"), prop.get("password"));
        HomeIntegratedAssessmentsPage page = new HomeIntegratedAssessmentsPage(driver);
        page.openPage();
        page.clickNew();
        page.clickNext();
        page.clickYes();
        page.fillInInputFields(his);
        page.fillInTextFields();
        page.selectDropdownOption(his);
        page.saveForm();
    }
}
