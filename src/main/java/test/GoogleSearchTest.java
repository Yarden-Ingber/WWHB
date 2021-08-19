package test;

import logic.GoogleSearchLogic;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest extends TestBaseClass{

    GoogleSearchLogic googleSearchLogic;

    @BeforeMethod
    public void initTest() {
        googleSearchLogic = new GoogleSearchLogic(driver);
    }

    @Test
    public void test() {
        googleSearchLogic.navigateToGoogleSearch();
        googleSearchLogic.googleSearch("QA summit!!!");
    }
}
