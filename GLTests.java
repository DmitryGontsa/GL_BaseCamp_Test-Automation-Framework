package GLTests;

import common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pageobject.GlobalLogicSite.GLCareersResultsPage;
import pageobject.GlobalLogicSite.GLMainPage;

public class GLTests extends BaseTest {

    @Test
    public void verifyFirstHeaderOnGLCareersResultsPage() {

        String navigateUrl = propertyHelper.readProperty("globallogic.site.url");
        webDriver.get(navigateUrl);
        String searchText = "QA";

        GLMainPage glMainPage = new GLMainPage(webDriver);
        glMainPage.clickOnAllowAllCookiesButton();
        glMainPage.setSearchInput(searchText);

        GLCareersResultsPage glCareersResultsPage = glMainPage.moveOnGLCareersResultsPage();
        String actualResult = glCareersResultsPage.getFirstHeaderNameText();

        Assert.assertFalse("Warning! The Header Name is empty!", actualResult.isEmpty());
        System.out.println(actualResult);
    }
}
