package pageobject.GlobalLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbstractPage;

public class GlobalLogicMainPage extends AbstractPage {

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    private WebElement searchInput;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    private WebElement allowAllCookiesButton;

    public GlobalLogicMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnAllowAllCookiesButton() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(allowAllCookiesButton)).click();
    }

    public void setSearchInput(String searchText) {
        webDriverWait.until(ExpectedConditions.visibilityOf(searchInput)).sendKeys(searchText);
    }

    public GlobalLogicCareersResultsPage moveOnGlobalLogicCareersResultsPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        return new GlobalLogicCareersResultsPage(webDriver);
    }
}
