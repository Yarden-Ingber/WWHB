package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestBaseClass {

    protected WebDriver driver;

    @BeforeClass
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/yardeningber/Downloads/chromedriver");
        driver = new ChromeDriver();
    }
}
