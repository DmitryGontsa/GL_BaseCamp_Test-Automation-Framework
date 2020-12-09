import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbstractPage;

public class LoginMainPage extends AbstractPage {

    public String emailField = "dmitry.gontsa.invest@gmail.com";

    public String passwordField = "dmitry.gontsa";

    @FindBy(xpath = "//id[@name='examplename']")
    private WebElement loginButton;

    public LoginMainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public DashboardPage login() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        DashboardPage dashboardPage = new DashboardPage(webDriver);
        dashboardPage.setDashboard(emailField, passwordField);
        return new DashboardPage(webDriver);
    }
}
