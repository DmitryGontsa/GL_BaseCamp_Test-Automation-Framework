package pageobject.PypiSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbstractPage;

public class GoogleResultsPage extends AbstractPage {

    @FindBy(xpath = "//span[text()='pip install selenium - PyPI']")
    private WebElement pipInstallSeleniumItem;

    public GoogleResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public PypiSiteMainPage moveOnPypiSiteMainPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(pipInstallSeleniumItem)).click();
        return new PypiSiteMainPage(webDriver);
    }
}
