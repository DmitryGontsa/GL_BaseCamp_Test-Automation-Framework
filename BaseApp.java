package pageobject;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@Data
public abstract class BaseApp {

    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;
    protected Actions actions;

    public BaseApp(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.actions = new Actions(webDriver);
        webDriverWait = new WebDriverWait(webDriver, 30);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnWebElement(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement)).click();
    }

    public void sendKeys(WebElement webElement, String key) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement)).sendKeys(key);
    }

    public String getText(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    public void webDriverWait(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public Actions moveOnWebElement(WebElement webElement) {
        Actions builder = new Actions(webDriver);
        Actions hoverOverLocationSelector = builder.moveToElement(webElement);
        hoverOverLocationSelector.perform();
        return hoverOverLocationSelector;
    }
}
