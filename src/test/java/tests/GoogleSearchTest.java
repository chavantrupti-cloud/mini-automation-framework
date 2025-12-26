package test.java.tests;

import test.java.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.pages.GoogleHomePage;
import test.java.utils.ConfigReader;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void verifyGoogleSearch() {
        GoogleHomePage google = new GoogleHomePage(driver);
       // google.open();
        google.search("Selenium WebDriver");

        Assert.assertTrue(driver.getTitle().contains("Selenium"));
    }
}
