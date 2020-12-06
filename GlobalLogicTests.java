package GlobalLogic;

import common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pageobject.GlobalLogic.GlobalLogicCareersResultsPage;
import pageobject.GlobalLogic.GlobalLogicMainPage;

public class GlobalLogicTests extends BaseTest {

    @Test
    public void verifyFirstHeaderOnGlobalLogicCareersResultsPage() {

        String navigateUrl = propertyHelper.readProperty("globallogic.site.url");
        webDriver.get(navigateUrl);
        String searchText = "QA";

        GlobalLogicMainPage globalLogicMainPage = new GlobalLogicMainPage(webDriver);
        globalLogicMainPage.clickOnAllowAllCookiesButton();
        globalLogicMainPage.setSearchInput(searchText);

        GlobalLogicCareersResultsPage globalLogicCareersResultsPage = globalLogicMainPage.moveOnGlobalLogicCareersResultsPage();
        String actualResult = globalLogicCareersResultsPage.getHeaderNameText();

        Assert.assertFalse("Warning! The Header Name is empty!", actualResult.isEmpty());
        System.out.println(actualResult);
    }
}
