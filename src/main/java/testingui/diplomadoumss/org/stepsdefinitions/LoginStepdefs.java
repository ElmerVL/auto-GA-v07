package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.adminsmanagement.AdminsManagement;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class LoginStepdefs {

    private Login login;

    private Dashboard dashboard;

    private AdminsManagement adminsManagement;

    @Given("^I Load PHP Travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPHPTravels();
    }

    @And("^Set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^Click 'Cars' link on 'Left Panel' Page$")
    public void clickCarsLinkOnLeftPanelPage() throws  Throwable {
        dashboard.clickCarsExpand();
    }

    @And("^Click 'Accounts' link on 'Left Panel' Page$")
    public void clickAccountsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickAccountsExpand();
    }

    @And("^Click 'Admins' link on 'Accounts Expand'$")
    public void clickAdminsLinkOnAccountsExpand() throws Throwable {
        dashboard.clickAdminsOption();
    }

    @And("^Click 'PRINT' button on 'admin management' page$")
    public void clickPRINTButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickPrintOption();
    }

    @And("^fill \"([^\"]*)\" email field on 'Login' page$")
    public void fillEmailFieldOnLoginPage(String email) throws Throwable {
        login.setEmail(email);
    }

    @And("^fill \"([^\"]*)\" password field on 'Login' page$")
    public void fillPasswordFieldOnLoginPage(String password) throws Throwable {
        login.setPassword(password);
    }

    @Then("^verify the \"([^\"]*)\" label button is displayed on 'Login' page$")
    public void verifyTheLabelButtonIsDisplayedOnLoginPage(String loginLabelButton) throws Throwable {
        String loginLabelButtonCurrent = login.getLoginLabelButton();

        Assert.assertEquals(loginLabelButtonCurrent, loginLabelButton, "Login page is verifying the 'LOGIN' label button.");
    }

    @And("^Click 'Check All' checkbox on header list$")
    public void clickCheckAllCheckboxOnHeaderList() {
        dashboard.clickCheckboxAllOption();
    }

    @And("^Click 'EXPORT INTO CSV' button on 'admin management' page$")
    public void clickEXPORTINTOCSVButtonOnAdminManagementPage() {
        dashboard.clickExportIntoCsvOption();
    }

    @And("^Click 'First Name' column on header list to 'desc' order$")
    public void clickFirstNameColumnOnHeaderListToDescOrder() {
        dashboard.clickDescOrderFirstNameColumnOption();
    }

    @And("^Click 'First Name' column on header list to 'asc' order$")
    public void clickFirstNameColumnOnHeaderListToAscOrder() {
        dashboard.clickAscOrderFirstNameColumnOption();
    }
}
