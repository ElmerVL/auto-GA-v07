package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.adminsmanagement.AdminsManagement;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.nasapage.NasaPage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToSecond;

public class LoginStepdefs {

    private Login login;

    private Dashboard dashboard;

    private AdminsManagement adminsManagement;

    private NasaPage nasaPage;

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

    @And("^Click 'Last Name' column on header list to 'desc' order$")
    public void clickLastNameColumnOnHeaderListToDescOrder() throws Throwable {
        dashboard.clickAscOrderLastNameColumnOption();
    }

    @And("^Click 'Last Name' column on header list to 'asc' order$")
    public void clickLastNameColumnOnHeaderListToAscOrder() throws Throwable {
        dashboard.clickDescOrderLastNameColumnOption();
    }

    @And("^Click 'Email' column on header list to 'desc' order$")
    public void clickEmailColumnOnHeaderListToDescOrder() throws Throwable {
        dashboard.clickAscOrderEmailColumnOption();
    }

    @And("^Click 'Email' column on header list to 'asc' order$")
    public void clickEmailColumnOnHeaderListToAscOrder() throws Throwable {
        dashboard.clickDescOrderEmailColumnOption();
    }

    @And("^Click 'Active' column on header list to 'desc' order$")
    public void clickActiveColumnOnHeaderListToDescOrder() throws Throwable {
        dashboard.clickAscOrderActiveColumnOption();
    }

    @And("^Click 'Active' column on header list to 'asc' order$")
    public void clickActiveColumnOnHeaderListToAscOrder() throws Throwable {
        dashboard.clickDescOrderActiveColumnOption();
    }

    @And("^Click 'Last Login' column on header list to 'desc' order$")
    public void clickLastLoginColumnOnHeaderListToDescOrder() throws Throwable {
        dashboard.clickAscOrderLastLoginColumnOption();
    }

    @And("^Click 'Last Login' column on header list to 'asc' order$")
    public void clickLastLoginColumnOnHeaderListToAscOrder() throws Throwable {
        dashboard.clickDescOrderLastLoginColumnOption();
    }

    @And("^Click 'EDIT' button on 'admin management' page$")
    public void clickEDITButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickEditOption();
    }

    @And("^Click 'DELETE' button on 'admin management' page$")
    public void clickDELETEButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickDeleteOption();
    }

    @And("^Click 'ADD' button on 'admin management' page$")
    public void clickADDButtonOnAdminManagementPage() throws Throwable {
        dashboard.clickAddption();
    }

    @Given("^I load API NASA Page$")
    public void iLoadAPINASAPage() {
        nasaPage = LoadPage.loadApiNasa();
    }

    @And("^Click NASA API Listing$")
    public void clickNASAAPIListing() {
        nasaPage.clickNasaApiListingOption();
    }

    @And("^Click NASA API Listing One More$")
    public void clickNASAAPIListingOneMore() {
        avoidToSecond(3);
        nasaPage.clickNasaApiListingOption();
    }

    @And("^click Earth Option on Left Panel$")
    public void clickEarthOptionOnLeftPanel() {
        avoidToSecond(3);
        nasaPage.clickEarthOption();
    }

    @And("^click Imagery Option On Sub Menu$")
    public void clickImageryOptionOnSubMenu() {
        nasaPage.clickImageryOption();
    }
}
