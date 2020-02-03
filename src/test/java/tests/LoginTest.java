package tests;

import org.testng.annotations.Test;
import pages.HomeIntegratedAssessmentsPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.loginUser("aqa1@mailinator.com", System.getProperty("password"));
        HomeIntegratedAssessmentsPage page = new HomeIntegratedAssessmentsPage(driver);
        page.openPage();
        page.clickNew();
        page.clickNext();
        page.clickYes();
        page.fillInInputFields();
        page.fillInTextFields();
        page.selectDropdownOption();
        //page.saveForm();
    }

}
