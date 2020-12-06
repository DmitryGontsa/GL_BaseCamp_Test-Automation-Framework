package PypiSite;

import common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pageobject.PypiSite.*;

public class PypiSiteTests extends BaseTest {

    @Test
    public void verifyTitleTextOnPypiSecondResultPage() {

        String navigateUrl = propertyHelper.readProperty("google.site.url");
        webDriver.get(navigateUrl);

        String searchText1 = "selenium install ubuntu python";
        String searchText2 = "selenium";

        GoogleMainPage googleMainPage = new GoogleMainPage(webDriver);
        GoogleResultsPage googleResultsPage = googleMainPage.setGoogleSearchInputAndClickSubmit(searchText1);

        PypiSiteMainPage pypiSiteMainPage = googleResultsPage.moveOnPypiSiteMainPage();
        pypiSiteMainPage.setSearchProjectsInput(searchText2);

        PypiSiteResultsPage pypiSiteResultsPage = pypiSiteMainPage.moveOnPypiSiteResultsPage();
        String expectedResult = pypiSiteResultsPage.getSecondItemText();

        PypiSecondResultPage pypiSecondResultPage = pypiSiteResultsPage.openPypiSecondResultPage();
        String actualResult = pypiSecondResultPage.getTitleText();

        Assert.assertEquals("This is incorrect title text!", expectedResult, actualResult);
    }
}
