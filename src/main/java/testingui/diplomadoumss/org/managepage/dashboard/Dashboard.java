package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.leftpanel.LeftPanel;

public class Dashboard extends BasePage {

    @FindBy(xpath = "//*[@href='#Cars']")
    private WebElement clickCarsSelected;

    @FindBy(xpath = "//*[@href='https://www.phptravels.net/admin-portal/admin/cars']")
    private WebElement clickCars;

    public void clickCarsSelected() {
        clickCarsSelected.click();
    }

    public void clickCars() {
        clickCars.click();
    }

    public LeftPanel setLeftPanel() {
        this.clickCarsSelected();
        this.clickCars();
        return new LeftPanel();
    }
}
