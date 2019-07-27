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
}
