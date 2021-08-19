package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserToucher {

    public static void click(WebDriver driver, By selector) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(selector));
            driver.findElement(selector).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.elementToBeClickable(selector));
            driver.findElement(selector).click();
        }
    }

    public static void setText(WebDriver driver, By selector, String text) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(selector));
            driver.findElement(selector).sendKeys(text);
        } catch (Exception e) {
            wait.until(ExpectedConditions.elementToBeClickable(selector));
            driver.findElement(selector).sendKeys(text);
        }
    }

    public static void navigateToUrl(WebDriver driver, String url) {
        driver.get(url);
    }

    private static final int WAIT_TIME = 2;
}
