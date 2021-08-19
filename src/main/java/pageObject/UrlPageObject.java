package pageObject;

import core.BrowserToucher;
import org.openqa.selenium.WebDriver;

public class UrlPageObject {

    public static void navigateToUrl(WebDriver driver, String url) {
        BrowserToucher.navigateToUrl(driver, url);
    }

}
