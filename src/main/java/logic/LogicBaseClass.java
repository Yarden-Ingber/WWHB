package logic;

import org.openqa.selenium.WebDriver;

public class LogicBaseClass {

    protected WebDriver driver;

    public LogicBaseClass(WebDriver driver) {
        this.driver = driver;
    }
}
