import org.openqa.selenium.WebDriver;
import pageobject.AbstractPage;

public class DashboardPage extends AbstractPage {

    public String emailField;

    public String passwordField;

    public DashboardPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void setDashboard(String email, String password) {
        this.emailField = email;
        this.passwordField = password;
    }
}
