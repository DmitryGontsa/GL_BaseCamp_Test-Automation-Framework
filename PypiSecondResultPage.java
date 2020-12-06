package pageobject.PypiSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbstractPage;

public class PypiSecondResultPage extends AbstractPage {

    @FindBy(xpath = "//h1[@class='package-header__name']")
    private WebElement title;

    public PypiSecondResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getTitleText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(title));
        String titleText = title.getText();
        return titleText.substring(0, 15);
    }
}
