package pageobject.GlobalLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbstractPage;

public class GlobalLogicCareersResultsPage extends AbstractPage {

    @FindBy(xpath = "(//div[@class='col-12 col-lg-9']/p)[1]")
    private WebElement headerName;

    public GlobalLogicCareersResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getHeaderNameText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(headerName));
        return headerName.getText();
    }
}
