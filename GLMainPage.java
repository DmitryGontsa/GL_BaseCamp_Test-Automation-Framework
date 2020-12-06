package pageobject.GlobalLogicSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobject.BaseApp;

public class GLMainPage extends BaseApp {

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    private WebElement searchInput;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    private WebElement allowAllCookiesButton;

    public GLMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnAllowAllCookiesButton() {
        clickOnWebElement(allowAllCookiesButton);
    }

    public void setSearchInput(String searchText) {
        sendKeys(searchInput, searchText);
    }

    public GLCareersResultsPage moveOnGLCareersResultsPage() {
        clickOnWebElement(searchButton);
        return new GLCareersResultsPage(webDriver);
    }
}
