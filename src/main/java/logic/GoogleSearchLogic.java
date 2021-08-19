package logic;

import org.openqa.selenium.WebDriver;
import pageObject.GoogleSearchPage;
import pageObject.UrlPageObject;

public class GoogleSearchLogic extends LogicBaseClass{

    public GoogleSearchLogic(WebDriver driver) {
        super(driver);
    }

    public void navigateToGoogleSearch() {
        UrlPageObject.navigateToUrl(driver, "https://www.google.com/webhp?hl=en");
    }

    public void googleSearch(String text) {
        GoogleSearchPage.searchBar.setText(driver, text);
    }
}
