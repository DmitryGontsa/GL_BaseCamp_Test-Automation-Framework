package pageobject.PypiSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbstractPage;

public class PypiSiteResultsPage extends AbstractPage {

    @FindBy(xpath = "(//h3[@class='package-snippet__title'])[2]")
    private WebElement secondItem;

    @FindBy(xpath = "(//h3[@class='package-snippet__title'])[2]/span[@class='package-snippet__name']")
    private WebElement secondItemWithNeedsTextValue;

    public PypiSiteResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getSecondItemText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(secondItemWithNeedsTextValue));
        return secondItemWithNeedsTextValue.getText();
    }

    public PypiSecondResultPage openPypiSecondResultPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(secondItem)).click();
        return new PypiSecondResultPage(webDriver);
    }
}
