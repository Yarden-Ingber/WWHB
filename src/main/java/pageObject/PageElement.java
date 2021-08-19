package pageObject;

import core.BrowserToucher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageElement {

    private By selector;
    private String description;

    public PageElement(By selector, String description){
        this.selector = selector;
        this.description = description;
    }

    public void click(WebDriver driver) {
        BrowserToucher.click(driver, selector);
    }

    public void setText(WebDriver driver, String text) {
        System.out.println("Setting text: \"" + text + "\" to element: " + description);
        BrowserToucher.setText(driver, selector, text);
    }
}
