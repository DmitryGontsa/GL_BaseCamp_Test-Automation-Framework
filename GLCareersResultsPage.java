package pageobject.GlobalLogicSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobject.BaseApp;

public class GLCareersResultsPage extends BaseApp {

    @FindBy(xpath = "(//div[@class='col-12 col-lg-9']/p)[1]")
    private WebElement firstHeaderName;

    public GLCareersResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getFirstHeaderNameText() {
        return getText(firstHeaderName);
    }
}
