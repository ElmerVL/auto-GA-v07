package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftpanel.LeftPanel;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Dashboard extends BasePage {

    ////a[contains(@href,'logout.php')]/@href
    //@FindBy(css = "a[@href='#Cars']")
    //private WebElement clickCarsSelected;

    //@FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/cars']")
    //private WebElement clickCars;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Accounts') and @aria-expanded='false']")
    private WebElement accountsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//ul[@id='ACCOUNTS']//a[contains(., 'Admins')]")
    private WebElement adminsClicked;

    public Dashboard() {
        //isWebElementVisible(bookingLink);
        avoidToSecond(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    public Dashboard clickAccountsExpand() {
        clickWebElement(accountsExpand);
        return this;
    }

    public Dashboard clickAdmindsOption() {
        clickWebElement(adminsClicked);
        return this;
    }

   /** public void clickCarsSelected() {
        clickCarsSelected.click();
    }

    public void clickCars() {
        clickCars.click();
    }

    public LeftPanel setLeftPanel() {
        this.clickCarsSelected();
        this.clickCars();
        return new LeftPanel();
    }**/
}
