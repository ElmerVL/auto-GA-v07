package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Accounts') and @aria-expanded='false']")
    private WebElement accountsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='ACCOUNTS']//a[contains(., 'Admins')]")
    private WebElement adminsClicked;

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., 'Print')]")
    private WebElement printClicked;

    @FindBy(xpath = "//div[@class='xcrud-top-actions']//div[@class='btn-group pull-right']//a[contains(., ' Export into CSV')]")
    private WebElement exportIntoCsvClicked;

    @FindBy(xpath = "//div[@class='icheckbox_square-grey']//input[@class='all']")
    private WebElement clickCheckboxAll;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_first_name']")
    private WebElement clickDescOrderFirstNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_first_name']")
    private WebElement clickAscOrderFirstNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_last_name']")
    private WebElement clickDescOrderLastNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.ai_last_name']")
    private WebElement clickAscOrderLastNameColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_email']")
    private WebElement clickDescOrderEmailColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_email']")
    private WebElement clickAscOrderEmailColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_status']")
    private WebElement clickDescOrderActiveColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_status']")
    private WebElement clickAscOrderActiveColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_last_login']")
    private WebElement clickDescOrderLastLoginColumn;

    @FindBy(xpath = "//tr[@class='xcrud-th']//th[@data-orderby='pt_accounts.accounts_last_login']")
    private WebElement clickAscOrderLastLoginColumn;

    @FindBy(xpath = "//td//span[@class='btn-group']//a[@title='Edit' and @href='https://www.phptravels.net/admin-portal/admin/accounts/admins/edit/323']")
    private WebElement editClicked;

    @FindBy(xpath = "//td//span[@class='btn-group']//a[@title='DELETE' and @id='323']")
    private WebElement deleteClicked;

    @FindBy(xpath = "//button[@class='btn btn-success' and @type='submit' and contains(text(), 'Add')]")
    private WebElement addClicked;

    public Dashboard() {
        //isWebElementVisible(bookingLink);
        avoidToSecond(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(By.xpath(String.format(PANEL_LEFT_OPTION,"Hotels", "Rooms")));
        //clickWebElement(carsExpand);
        return this;
    }

    public Dashboard clickAccountsExpand() {
        clickWebElement(accountsExpand);
        return this;
    }

    public Dashboard clickAdminsOption() {
        clickWebElement(adminsClicked);
        return this;
    }

    public Dashboard clickPrintOption() {
        clickWebElement(printClicked);
        return this;
    }

    public Dashboard clickExportIntoCsvOption() {
        clickWebElement(exportIntoCsvClicked);
        return this;
    }

    public Dashboard clickCheckboxAllOption() {
        clickWebElement(clickCheckboxAll);
        return this;
    }

    public Dashboard clickDescOrderFirstNameColumnOption() {
        clickWebElement(clickDescOrderFirstNameColumn);
        return this;
    }

    public Dashboard clickAscOrderFirstNameColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderFirstNameColumn);
        return this;
    }

    public Dashboard clickDescOrderLastNameColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickDescOrderLastNameColumn);
        return this;
    }

    public Dashboard clickAscOrderLastNameColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderLastNameColumn);
        return this;
    }

    public Dashboard clickDescOrderEmailColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickDescOrderEmailColumn);
        return this;
    }

    public Dashboard clickAscOrderEmailColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderEmailColumn);
        return this;
    }

    public Dashboard clickDescOrderActiveColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickDescOrderActiveColumn);
        return this;
    }

    public Dashboard clickAscOrderActiveColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderActiveColumn);
        return this;
    }

    public Dashboard clickDescOrderLastLoginColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickDescOrderLastLoginColumn);
        return this;
    }

    public Dashboard clickAscOrderLastLoginColumnOption() {
        avoidToSecond(3);
        clickWebElement(clickAscOrderLastLoginColumn);
        return this;
    }

    public Dashboard clickEditOption() {
        clickWebElement(editClicked);
        return this;
    }

    public Dashboard clickDeleteOption() {
        clickWebElement(deleteClicked);
        return this;
    }

    public Dashboard clickAddption() {
        clickWebElement(addClicked);
        return this;
    }
}
