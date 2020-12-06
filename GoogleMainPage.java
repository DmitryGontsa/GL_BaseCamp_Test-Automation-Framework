package pageobject.PypiSite;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbstractPage;

public class GoogleMainPage extends AbstractPage {

    @FindBy(xpath = "//input[@type='text']")
    private WebElement googleSearchInput;

    public GoogleMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public GoogleResultsPage setGoogleSearchInputAndClickSubmit(String searchText) {
        webDriverWait.until(ExpectedConditions.visibilityOf(googleSearchInput));
        googleSearchInput.sendKeys(searchText, Keys.ENTER);
        return new GoogleResultsPage(webDriver);
    }
}
