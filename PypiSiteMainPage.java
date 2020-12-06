package pageobject.PypiSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbstractPage;

public class PypiSiteMainPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='search'][@placeholder='Search projects']")
    private WebElement searchProjectsInput;

    @FindBy(xpath = "(//button[@type='submit'][@class='search-form__button'])[1]")
    private WebElement searchButton;

    public PypiSiteMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void setSearchProjectsInput(String searchText) {
        webDriverWait.until(ExpectedConditions.visibilityOf(searchProjectsInput)).sendKeys(searchText);
    }

    public PypiSiteResultsPage moveOnPypiSiteResultsPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        return new PypiSiteResultsPage(webDriver);
    }
}
